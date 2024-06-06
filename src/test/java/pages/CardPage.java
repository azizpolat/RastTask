package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CardPage {

    public CardPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath = "//*[@class=\"a-link-emphasis pmts-add-cc-default-trigger-link\"]")
    public WebElement addToCardLink;

    @FindBy(xpath = "//*[@class=\"a-popover-header-content\"]")
    public WebElement addToCardAssert;

    @FindBy(xpath = "//*[@id=\"pp-Xlm0dJ-18\"]")
    public WebElement cardNumberButton;

    @FindBy(xpath = "//*[@name=\"ppw-accountHolderName\"]")
    public WebElement cardNameButton;

    @FindBy(xpath = "//*[@name=\"ppw-expirationDate_year\"]")
    public WebElement selectName;

    @FindBy(id = "pp-wxMIrt-34")
    public WebElement atTocardButton;

    @FindBy(xpath = "(//*[@class=\"a-list-item\"])[1]")
    public WebElement cardAlert;







}
