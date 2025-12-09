package StepDefinitions;

import Pages.DialogPage;
import Utilities.DBUtility;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.ArrayList;

public class _07_SearchSteps {

    DialogPage dp=new DialogPage();

    @Then("Send The Query the Database {string} and control match")
    public void sendTheQueryTheDatabaseAndControlMatch(String sorgu) {
        ArrayList< ArrayList<String>> dbUrunler= DBUtility.getListData(sorgu);

        //System.out.println("dbUrunler = " + dbUrunler);

        Assert.assertTrue(dp.srcNameList.size()==dbUrunler.size(),"Ürün sayıları aynı değil");

        for (int i = 0; i < dp.srcNameList.size(); i++)
            Assert.assertEquals(dp.srcNameList.get(i).getText(), // web deki sıradaki urun adı
                                dbUrunler.get(i).get(0), // db deki sıradaki urun adı
                    "Eşleştirme yapılamadı");

    }
}
