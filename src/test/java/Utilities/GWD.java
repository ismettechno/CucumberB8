package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Locale;

public class GWD {
    private static ThreadLocal<WebDriver> threadDriver=new ThreadLocal<>();
    public static ThreadLocal<String> threadBrowserName=new ThreadLocal<>();

    // threadDriver.get() bu hattaki driver

    public static WebDriver getDriver()
    {
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        System.out.println("threadBrowserName = " + threadBrowserName.get());
        if (threadBrowserName.get() == null) // XML den çalışmayacak diğer testlerde tarayıcı boş geldiğinde
            threadBrowserName.set("chrome");  // tarayıcı adı CHROME olarak default olsun

        if (threadDriver.get() == null) { //bir kere oluştursun

           switch (threadBrowserName.get())
           {
               case "edge" : threadDriver.set(new EdgeDriver()); break;
               case "firefox" : threadDriver.set(new FirefoxDriver()); break;
               default:
                   threadDriver.set(new ChromeDriver());
           }

            threadDriver.get().manage().window().maximize(); // Ekranı max yapıyor.
            threadDriver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); // 20 sn mühlet: sayfayı yükleme mühlet
        }

        return threadDriver.get();
    }

    public static void quitDriver()
    {
        //test sonucu ekranı bir miktar beklesin diye
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (threadDriver.get() != null) {
            threadDriver.get().quit(); // tarayıcı kapat, hafızada(thread) değişken duruyor

            WebDriver driver=threadDriver.get(); // thread de ki değişkeni al
            driver=null; // değişkene NULL değerini ata
            threadDriver.set(driver); // thread e bu değişkeni set et
        }
    }




}
