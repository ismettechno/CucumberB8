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

    @FindBy(linkText ="Address Book" )
    public WebElement AddressBook;

    @FindBy(linkText = "New Address")
    public WebElement NewAddress;

    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "EditAccount" : return this.EditAccount;
            case "ContactUs" : return this.ContactUs;
            case "Newsletter" : return this.Newsletter;
            case "AddressBook" :return this.AddressBook;
            case "NewAddress": return this.NewAddress;

            default : return null;
        }
    }


}
