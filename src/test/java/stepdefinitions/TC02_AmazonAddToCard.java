package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AddToProductPage;
import utilities.Driver;
import utilities.ReusableMethods;
import static org.openqa.selenium.Keys.PAGE_DOWN;

public class TC02_AmazonAddToCard {

    AddToProductPage addToCardPageObject = new AddToProductPage();
    Actions actions = new Actions(Driver.getDriver());
    @Given("Kullanici Search Alanina Skechers Erkek Ayakkabisi yazar")
    public void kullanici_search_alanina_skechers_erkek_ayakkabisi_yazar() {
        ReusableMethods.waitFor(1);
        addToCardPageObject.searchArea.sendKeys("skechers erkek ayakkabisi");
    }
    @When("Kullanici Search Butonuna Tiklar")
    public void kullanici_search_butonuna_tiklar() {
        ReusableMethods.waitFor(1);
        addToCardPageObject.searchButton.click();
    }
    @When("Kullanici Sonuclar Sayfasında Urunleri Gorur")
    public void kullanici_sonuclar_sayfasında_urunleri_gorur() {
        ReusableMethods.waitFor(1);
        addToCardPageObject.searchResult.isDisplayed();
        actions.sendKeys(PAGE_DOWN);

    }
    @When("Kullanici Herhangi Bir Ayakkabi Secimi Yapar")
    public void kullanici_herhangi_bir_ayakkabi_secimi_yapar() {
        ReusableMethods.waitFor(1);
        addToCardPageObject.productSelection.click();
    }

    @When("Kullanici Numara Secimi Yapar")
    public void kullanici_numara_secimi_yapar() {
        ReusableMethods.waitFor(1);
        Select select = new Select(addToCardPageObject.selectedNumber);
        select.selectByVisibleText("42 EU");
    }
    @When("Kullanici Sepete Ekle Butonuna Tıklar")
    public void kullanici_sepete_ekle_butonuna_tıklar() {
        ReusableMethods.waitFor(1);
        addToCardPageObject.addToCardButton.click();
    }
    @When("Kullanici Ekledigi Urunu Sepette Gorur")
    public void kullanici_ekledigi_urunu_sepette_gorur() {
        ReusableMethods.waitFor(1);
        addToCardPageObject.addToCardSuccess.isDisplayed();
    }




}
