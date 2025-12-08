package StepDefinitions;

import Pages.DialogPage;
import Pages.NavigatePage;
import Utilities.ExcelUtility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.Arrays;
import java.util.List;

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

    @When("User update EditAccount from Excel")
    public void userUpdateEditAccountFromExcel() {
        List<List<String>> tablo = ExcelUtility.getData(
                "src/test/java/ApachePOI/Resource/EditAccount.xlsx",
                "editAccount",
                2
        );

        for(List<String> satir : tablo)
        {
            np.myClick(np.EditAccount);  // kayıt işleminden sonra her döngüde edit ekranı gelmesi için
            dp.mySendKeys(dp.inputFirstname, satir.get(0));
            dp.mySendKeys(dp.inputLastname, satir.get(1));
            dp.myClick(dp.cntBtn);
            dp.SuccessMessageValidation();
        }
    }
}
