package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Locale;

public class GWD {
    private static WebDriver driver;

    public static WebDriver getDriver()
    {
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        if (driver == null) { //bir kere oluştursun
            driver = new ChromeDriver();
            driver.manage().window().maximize(); // Ekranı max yapıyor.
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); // 20 sn mühlet: sayfayı yükleme mühlet
        }

        return driver;
    }

    public static void quitDriver()
    {
        //test sonucu ekranı bir miktar beklesin diye
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (driver != null) {
            driver.quit();
            driver=null;
        }
    }




}
