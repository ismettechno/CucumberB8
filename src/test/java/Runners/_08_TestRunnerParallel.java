package Runners;

import Utilities.GWD;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


@CucumberOptions(
    features = {"src/test/java/FeatureFiles/_01_Login.feature"},  //buraya feature files ın path i verilecek.
    glue = {"StepDefinitions"}    // Step definitions ın klasörü adı yazılıyor.
)
public class _08_TestRunnerParallel extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters("BrowserTipi")
    public void beforeClass(String browserName)
    {
        GWD.threadBrowserName.set(browserName);
    }

}

