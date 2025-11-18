package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @After
    public void after(Scenario senaryo)
    {
        if (senaryo.isFailed())
        {
            TakesScreenshot ts=(TakesScreenshot) GWD.getDriver();
            byte[] hafidakiHali= ts.getScreenshotAs(OutputType.BYTES);
            senaryo.attach(hafidakiHali, "image/png", "screen shot");
        }

        System.out.println("Senaryo bitti : "+ (senaryo.isFailed() ? "Failed":"Passed") );
        GWD.quitDriver();
    }

}
