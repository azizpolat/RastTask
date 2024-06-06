package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonHomePage {


    public AmazonHomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"sp-cc-accept\"]")
    public WebElement cerezKabul;

    @FindBy (id = "nav-link-accountList-nav-line-1")
    public WebElement singInButon;





}
