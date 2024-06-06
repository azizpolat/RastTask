package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AddToProductPage {

    public AddToProductPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement searchArea;

    @FindBy(id="nav-search-submit-button")
    public WebElement searchButton;

    @FindBy (xpath = "//*[text()='Sonuçlar']")
    public  WebElement searchResult;

    @FindBy (xpath = "(//*[@class=\"a-section aok-relative s-image-tall-aspect\"])[1]")
    public WebElement productSelection;

    @FindBy (id = "native_dropdown_selected_size_name")
    public WebElement selectedNumber;

    @FindBy(id = "add-to-cart-button")
    public WebElement addToCardButton;

    @FindBy (xpath = "//*[@class=\"a-size-medium-plus a-color-base sw-atc-text a-text-bold\"]")
    public WebElement addToCardSuccess;



}
