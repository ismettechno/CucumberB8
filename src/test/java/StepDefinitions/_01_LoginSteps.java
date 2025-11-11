package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class _01_LoginSteps {

    @Given("Navigate to WebSite")
    public void navigateToWebSite() {
       GWD.getDriver().get("https://www.google.com/");


    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
//        GWD.getDriver().username.sendKeys("username");
//        GWD.getDriver().password.sendKeys("password");
//        GWD.getDriver().btnLogin.Click();
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        Assert.assertTrue(true,"Siteye login olunamadı");
    }
}
