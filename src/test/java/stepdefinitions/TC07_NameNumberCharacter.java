
package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.CardPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class TC07_NameNumberCharacter {


    CardPage cardPageObject = new CardPage();

    String expectedAlert = "\"Kart numarası\" alanının doldurulması zorunludur.";

    @Given("Kullanici Kredi karti veya banka karti ekleyin Linkine Tiklar")
    public void kullaniciKrediKartiVeyaBankaKartiEkleyinLinkineTiklar() {
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(cardPageObject.addToCardLink);
    }


    @When("Kullanici Kredi Karti veya Banka Karti Ekleme Sayfasini Gorur")
    public void kullaniciKrediKartiVeyaBankaKartiEklemeSayfasiniGorur() {
        ReusableMethods.waitFor(1);
        cardPageObject.addToCardAssert.isDisplayed();
    }

    @When("Kullanici Kart Numarasi Alanina Kart Numarasını Girer")
    public void kullaniciKartNumarasiAlaninaKartNumarasınıGirer() {
        ReusableMethods.waitFor(1);
        cardPageObject.cardNumberButton.click();
        ReusableMethods.sendKeysJS(cardPageObject.cardNumberButton,ConfigReader.getProperty("true_card_number"));

    }

    @When("Kullanici Kart Ad Alanina Sayı Girer")
    public void kullaniciKartAdAlaninaSayıGirer() {
        ReusableMethods.waitFor(1);
        ReusableMethods.sendKeysJS(cardPageObject.cardNameButton,ConfigReader.getProperty("number_name"));
    }

    @When("Kullanici Kart Son Kullanma Tarihi Girer")
    public void kullaniciKartSonKullanmaTarihiGirer() {
        ReusableMethods.waitFor(1);
        Select select = new Select(cardPageObject.selectName);
        select.selectByVisibleText("2026");
    }

    @When("Kullanici Kartinizi Ekleyin Butonuna Tiklar")
    public void kullaniciKartiniziEkleyinButonunaTiklar() {
        ReusableMethods.waitFor(1);
        cardPageObject.atTocardButton.click();
    }

    @When("Kullanici Kart Numarasi Dogru Degil Alert Gorur")
    public void kullaniciKartNumarasiDogruDegilAlertGorur() {
        ReusableMethods.waitFor(1);
        String alert = cardPageObject.cardAlert.getText();
        System.out.println(alert);
        System.out.println(expectedAlert);
        Assert.assertEquals(expectedAlert,alert);
    }




}

