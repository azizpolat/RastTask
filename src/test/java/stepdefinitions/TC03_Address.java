package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.AdressPage;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.openqa.selenium.Keys.PAGE_DOWN;

public class TC03_Address {

    AdressPage addressObject = new AdressPage();

    static Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanici Alisverisi Tamamla Butonuna Tiklar")
    public void kullaniciAlisverisiTamamlaButonunaTiklar() {
        ReusableMethods.waitFor(1);
        addressObject.completeShopping.click();
    }

    @When("Kullanici Odeme Sayfasinda Oldugunu Gorur")
    public void kullaniciOdemeSayfasindaOldugunuGorur() {
        ReusableMethods.waitFor(1);
        addressObject.paymentPage.isDisplayed();
    }

    @When("Kullanici Sisteme Kayitli Adreslerden Secim yapar")
    public void kullaniciSistemeKayitliAdreslerdenSecimYapar() {
        ReusableMethods.waitFor(1);
        addressObject.thisIsAddress.click();
        actions.sendKeys(PAGE_DOWN).perform();
    }

    @When("Kullanici Gumrukleme icin Simdilik Atla Butonunu Tiklar")
    public void kullaniciGumruklemeIcinSimdilikAtlaButonunuTiklar() {
        ReusableMethods.waitFor(2);
        actions.sendKeys(PAGE_DOWN).perform();
        ReusableMethods.clickByJS(addressObject.skipNow);

    }

    @And("Kullanici Gumrukleme Icin Devam Et Butonuna Tiklar")
    public void kullaniciGumruklemeIcinDevamEtButonunaTiklar() {
        ReusableMethods.waitFor(2);
        actions.sendKeys(PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        addressObject.continueButton.click();
    }

    @And("Kullanici Kredi karti veya banka karti ekleyin Linkine Tiklar")
    public void kullaniciKrediKartiVeyaBankaKartiEkleyinLinkineTiklar() {
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(addressObject.addToCardLink);
    }
}
