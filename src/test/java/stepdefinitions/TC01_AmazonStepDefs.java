package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.AmazonHomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC01_AmazonStepDefs {


    AmazonHomePage amazonPageObject = new AmazonHomePage();
    LoginPage girisPageObject = new LoginPage();
    @Given("Kullanici Amazon URL Gider")
    public void kullanici_amazon_url_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
        ReusableMethods.waitFor(1);
        amazonPageObject.cerezKabul.click();

    }
    @When("Kullanici Giris Yapin Sekmesine Tiklar")
    public void kullanici_giris_yapin_sekmesine_tiklar() {
        ReusableMethods.waitFor(1);
        amazonPageObject.singInButon.click();
    }
    @When("Kullanici Giris Yap Sayfasini Gorur")
    public void kullanici_giris_yap_sayfasini_gorur() {
        ReusableMethods.waitFor(1);
        girisPageObject.girisYapSayfasi.isDisplayed();
    }
    @When("Kullanici E-posta veya Telefon Alanina Bilgileri Girer")
    public void kullanici_e_posta_veya_telefon_alanina_bilgileri_girer() {
        ReusableMethods.waitFor(1);
        girisPageObject.emailAlani.sendKeys(ConfigReader.getProperty("kullanici_email"));
    }
    @When("Kullanici Devam Et Butonuna Tiklar")
    public void kullanici_devam_et_butonuna_tiklar() {
        ReusableMethods.waitFor(1);
        girisPageObject.devamEtButonu.click();

    }
    @When("Kullanici Sifre Alanına Bilgilerini Girer")
    public void kullanici_sifre_alanına_bilgilerini_girer() {
        ReusableMethods.waitFor(1);
        girisPageObject.passwordAlani.sendKeys(ConfigReader.getProperty("kullanici_password"));
    }
    @When("Kullanici Giris Yap Butonuna Tiklar")
    public void kullanici_giris_yap_butonuna_tiklar() {
        ReusableMethods.waitFor(1);
        girisPageObject.singInSubmit.click();

    }
    @When("Kullanici Login Oldugunu Dogrular")
    public void kullanici_login_oldugunu_dogrular() {
        ReusableMethods.waitFor(1);
        girisPageObject.LoginAssert.isDisplayed();

    }



}
