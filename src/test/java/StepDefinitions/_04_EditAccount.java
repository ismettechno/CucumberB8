package StepDefinitions;

import Pages.DialogPage;
import Pages.NavigatePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class _04_EditAccount {
    DialogPage dp=new DialogPage();
    NavigatePage np=new NavigatePage();

    @And("Navigate to Edit Account")
    public void navigateToEditAccount() {
        np.myClick(np.EditAccount);
    }

    @When("Edit Account name as {string} surname as {string}")
    public void editAccountNameAsSurnameAs(String name, String surname) {
        dp.mySendKeys(dp.inputFirstname, name);
        dp.mySendKeys(dp.inputLastname, surname);
        dp.myClick(dp.cntBtn);
    }
}
