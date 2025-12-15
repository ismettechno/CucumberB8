package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags= "@SmokeTest",
        features = {"src/test/java/FeatureFiles"}, // hepsi demek
        glue ={"StepDefinitions"}
        ,plugin= {"json:target/cucumber/cucumber.json"} // Je nkins için JSON report
)
public class _04_TestRunnerSmoke extends AbstractTestNGCucumberTests {
}
