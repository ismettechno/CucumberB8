package StepDefinitions;

import Pages.DialogPage;
import Pages.NavigatePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_NewsLetterSteps {
    DialogPage dp=new DialogPage();
    NavigatePage np=new NavigatePage();

    @And("Navigate to NewsLetter")
    public void navigateToNewsLetter() {
      np.myClick(np.Newsletter);
    }

    @When("Click to Yes")
    public void clickToYes() {
       dp.myClick(dp.subYes);
       dp.myClick(dp.cntBtn);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
      dp.SuccessMessageValidation();
    }
}
