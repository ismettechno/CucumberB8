package StepDefinitions;

import Pages.DialogPage;
import Pages.NavigatePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _03_ContactUs {
    DialogPage dp=new DialogPage();
    NavigatePage np= new NavigatePage();

    @And("Navigate to ContactUs")
    public void navigateToContactUs() {
       np.myClick(np.ContactUs);
    }

    @When("Send a message and click to Submit")
    public void sendAMessageAndClickToSubmit() {
       dp.mySendKeys(dp.enquiryArea, "Merhaba Testing dünyası");
       dp.myClick(dp.submitBtn);
    }

    @Then("Success message should be in URL")
    public void successMessageShouldBeInURL() {
        dp.verifyURLContainsText("success");
    }

    @When("Send a message as {string} and click to Submit")
    public void sendAMessageAsAndClickToSubmit(String mesaj) {
        dp.mySendKeys(dp.enquiryArea, mesaj);
        dp.myClick(dp.submitBtn);
    }
}
