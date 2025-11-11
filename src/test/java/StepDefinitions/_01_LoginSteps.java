package StepDefinitions;

import Pages.DialogPage;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class _01_LoginSteps {
    DialogPage dp=new DialogPage();

    @Given("Navigate to WebSite")
    public void navigateToWebSite() {
       GWD.getDriver().get("https://opencart.abstracta.us/index.php?route=account/login");
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        dp.mySendKeys(dp.username,"testng1@gmail.com");
        dp.mySendKeys(dp.password,"123qweasd");
        dp.myClick(dp.btnLogin);
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dp.verifyTitleContainsText("My Account");
    }
}
