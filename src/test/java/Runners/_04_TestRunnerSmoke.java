package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags= "@SmokeTest",
        features = {"src/test/java/FeatureFiles"}, // hepsi demek
        glue ={"StepDefinitions"}
)
public class _04_TestRunnerSmoke extends AbstractTestNGCucumberTests {
}
