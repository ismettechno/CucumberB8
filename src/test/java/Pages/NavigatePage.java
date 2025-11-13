package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigatePage extends ParentPage{

    @FindBy(linkText="Newsletter")
    public WebElement Newsletter;

    @FindBy(linkText="Contact Us")
    public WebElement ContactUs;

    @FindBy(linkText="Edit Account")
    public WebElement EditAccount;

    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "EditAccount" : return this.EditAccount;
            case "ContactUs" : return this.ContactUs;
            case "Newsletter" : return this.Newsletter;
            default : return null;
        }
    }


}
