package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class DialogPage extends ParentPage{

    public DialogPage() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath="//input[@id='input-email']")
    public WebElement username;

    @FindBy(xpath="//input[@id='input-password']")
    public WebElement password;

    @FindBy(xpath="//*[@value='Login']")
    public WebElement btnLogin;

    public void verifyTitleContainsText(String text){
        wait.until(ExpectedConditions.titleContains(text));
        Assert.assertTrue(GWD.getDriver().getTitle().toLowerCase().contains(text.toLowerCase()), "Login olunamadı");
    }


}
