package StepDefinitions;

import Pages.DialogPage;
import Pages.NavigatePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _06_DataTableSteps {
    NavigatePage np=new NavigatePage();
    DialogPage dp=new DialogPage();

    @And("Click on Element Navigate")
    public void clickOnElementNavigate(DataTable linkler) {
        List<String> listLinkler= linkler.asList();

        for (int i = 0; i < listLinkler.size(); i++) {
              np.myClick( np.getWebElement(listLinkler.get(i)) );
        }
    }

    @And("User sending info in Dialog")
    public void userSendingInfoInDialog(DataTable kutuVeYazilar) {
        List<List<String>> listKutuveYazilar= kutuVeYazilar.asLists();

        for (int i = 0; i < listKutuveYazilar.size(); i++) {
            dp.mySendKeys(dp.getWebElement(listKutuveYazilar.get(i).get(0))
                    ,listKutuveYazilar.get(i).get(1) );
        }

    }

    @And("Click on Element Dialog")
    public void clickOnElementDialog(DataTable butonlar) {
        List<String> listBtnlar= butonlar.asList();
        for (int i = 0; i < listBtnlar.size(); i++) {
            dp.myClick(dp.getWebElement(listBtnlar.get(i)));
        }
    }


    @Then("Select Element set value on Dialog")
    public void selectElementSetValueOnDialog(DataTable selectveDegerler) {

        List<List<String>> listSelectveDegerler= selectveDegerler.asLists();

        for (int i = 0; i < listSelectveDegerler.size(); i++) {
            Select selectMenu=new Select( dp.getWebElement( listSelectveDegerler.get(i).get(0))    );
            selectMenu.selectByVisibleText( listSelectveDegerler.get(i).get(1) );
        }

    }

    @Then("Wait until clickable on Element Dialog")
    public void waitUntilClickableOnElementDialog(DataTable elementler) {
        List<String> listElementler= elementler.asList();
        for (int i = 0; i < listElementler.size(); i++) {
             dp.wait.until(ExpectedConditions.elementToBeClickable(dp.getWebElement(listElementler.get(i))));
        }
    }
}
