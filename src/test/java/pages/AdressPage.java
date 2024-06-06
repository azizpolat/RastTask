package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdressPage {

    public AdressPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@name=\"proceedToRetailCheckout\"]")
    public WebElement completeShopping;

    @FindBy(xpath = "//*[@class=\"a-column a-span8\"]//h1")
    public WebElement paymentPage ;

    @FindBy(id = "shipToThisAddressButton")
    public  WebElement thisIsAddress;

    @FindBy(id = "kyc-xborder-radio-skip")
    public WebElement skipNow;

    @FindBy(xpath = "(//*[@class=\"a-button-input\"])[3]")
    public WebElement continueButton;

    @FindBy(xpath = "//*[@class=\"a-link-emphasis pmts-add-cc-default-trigger-link\"]")
    public WebElement addToCardLink;






}
