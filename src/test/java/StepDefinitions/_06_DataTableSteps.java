package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class _06_DataTableSteps {
    @And("Click on Element Navigate")
    public void clickOnElementNavigate(DataTable linkler) {
        List<String> listLinkler= linkler.asList();
        for (int i = 0; i < listLinkler.size(); i++) {
              Tıklat(listLinkler.get(i));
        }
    }

    @And("User sending info in Dialog")
    public void userSendingInfoInDialog(DataTable kutuVeYazilar) {
        List<List<String>> listKutuveYazilar= kutuVeYazilar.asLists();

        for (int i = 0; i < listKutuveYazilar.size(); i++) {
            sendKeys (listKutuveYazilar.get(0),listKutuveYazilar.get(1) );
        }

    }

    @And("Click on Element Dialog")
    public void clickOnElementDialog(DataTable butonlar) {
        List<String> listBtnlar= butonlar.asList();
        for (int i = 0; i < listBtnlar.size(); i++) {
            Tıklat(listBtnlar.get(i));
        }
    }
}
