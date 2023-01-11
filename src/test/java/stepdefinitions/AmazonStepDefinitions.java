package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazonPage=new AmazonPage();
    @Given("kullanici amazon anasayfaya gider")
    public void kullaniciAmazonAnasayfayaGider() {
        amazonPage=new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("amazon arama kutusuna nutella yazıp aratir")
    public void amazonAramaKutusunaNutellaYazıpAratir() {
        amazonPage.amazonAramaKutusu.sendKeys("Nutella", Keys.ENTER);
    }

    @And("arama sonuclarinin nutella icerdigini test eder")
    public void aramaSonuclarininNutellaIcerdiginiTestEder() {
        String actualAramaSonucu=amazonPage.aramaSonucuElementi.getText();
        String expectedKelime="Nutella";
        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));
    }
    @Then("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }


    @Then("amazon arama kutusuna Java yazıp aratir")
    public void amazonAramaKutusunaJavaYazıpAratir() {
        amazonPage.amazonAramaKutusu.sendKeys("Java", Keys.ENTER);
    }

    @And("arama sonuclarinin Java icerdigini test eder")
    public void aramaSonuclarininJavaIcerdiginiTestEder() {
        String actualAramaSonucu=amazonPage.aramaSonucuElementi.getText();
        String expectedKelime="Java";
        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));
    }

    @Then("amazon arama kutusuna Samsung yazıp aratir")
    public void amazonAramaKutusunaSamsungYazıpAratir() {
        amazonPage.amazonAramaKutusu.sendKeys("Samsung", Keys.ENTER);
    }

    @And("arama sonuclarinin Samsung icerdigini test eder")
    public void aramaSonuclarininSamsungIcerdiginiTestEder() {
        String actualAramaSonucu=amazonPage.aramaSonucuElementi.getText();
        String expectedKelime="Samsung";
        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));
    }
}
