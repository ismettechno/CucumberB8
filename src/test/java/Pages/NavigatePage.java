package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigatePage extends ParentPage{


    @FindBy(linkText="Newsletter")
    public WebElement Newsletter;

}
