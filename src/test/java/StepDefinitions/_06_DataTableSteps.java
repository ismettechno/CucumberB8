package StepDefinitions;

import Pages.DialogPage;
import Pages.NavigatePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

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
}
