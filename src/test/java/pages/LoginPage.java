package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class=\"a-spacing-small\"]")
    public WebElement girisYapSayfasi;

    @FindBy (id = "ap_email")
    public WebElement emailAlani;

    @FindBy (id = "ap_password")
    public WebElement passwordAlani;

    @FindBy (id = "continue")
    public WebElement devamEtButonu;

    @FindBy(id = "signInSubmit")
    public  WebElement singInSubmit;

    @FindBy(xpath = "//*[text()='Monte\u200B']")
    public WebElement LoginAssert;



}
