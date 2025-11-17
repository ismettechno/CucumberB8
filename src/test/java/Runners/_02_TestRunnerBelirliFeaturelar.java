package Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature",
                    "src/test/java/FeatureFiles/_02_NewsLetter.feature",
                    "src/test/java/FeatureFiles/_03_ContactUs.feature"},
        glue ={"StepDefinitions"}
)
public class _02_TestRunnerBelirliFeaturelar extends AbstractTestNGCucumberTests {
}
