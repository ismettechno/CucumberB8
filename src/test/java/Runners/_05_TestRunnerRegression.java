package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags= "@Regression",  //"@SmokeTest or @Regression",
        features = {"src/test/java/FeatureFiles"}, // hepsi demek
        glue ={"StepDefinitions"}
        ,plugin= {"json:target/cucumber/cucumber.json"} // Jenkins için JSON report
)
public class _05_TestRunnerRegression extends AbstractTestNGCucumberTests {
}

// group da OR var ise : herhangi birisi olan çağrılır
// group da AND var ise : her iki grup adı olanlar çağrılır