package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US_001_TC_01_UI {


    HomePage homePage = new HomePage();


    @Given("Anasayfaya git")
    public void anasayfaya_git() {

        Driver.getDriver().get(ConfigReader.getProperty("acibademHastaneleri_url"));

    }



    @Given("Size nasil yardimci olabiliriz?' yazisi gor")
    public void size_nasil_yardimci_olabiliriz_yazisi_gor() {

        assertTrue(homePage.searchtext.isDisplayed());

    }



    @And("Aranacak kelime arama kutusuna yazilarak -Populer Aramalar-in gorunurlugu ve tiklanabilirligini dogrula")
    public void aranacakKelimeAramaKutusunaYazilarakPopulerAramalarInGorunurluguVeTiklanabilirliginiDogrula() throws InterruptedException {

        homePage.searchbox.sendKeys("Zatürre");

        homePage.populeraramazaturre.isDisplayed();
        homePage.populeraramazaturre.click();


        Driver.getDriver().navigate().back();
        ReusableMethods.waitFor(3);
    }



    @Given("Aranacak kelime arama kutusuna yazilarak secilebilecek seceneklerin tiklanabilirligi dogrula")
    public void aranacak_kelime_arama_kutusuna_yazilarak_secilebilecek_seceneklerin_tiklanabilirligi_dogrula() {

        homePage.searchbox.sendKeys("Zatürre");
        homePage.zaturreoptions1.isDisplayed();
        homePage.zaturreoptions1.click();


       // Select select = new Select();
        //select.selectByValue("Zatürre (Pnömoni)");

        Driver.getDriver().navigate().back();

    }


    @Given("Aranacak kelime arama kutusuna yazilarak secilebilecek seceneklerin gorunurlugu dogrula")
    public void aranacak_kelime_arama_kutusuna_yazilarak_secilebilecek_seceneklerin_gorunurlugu_dogrula() {

        System.out.println("Bir önceki stepte yapildi");

    }



    @Given("Arama kutusunda bulunan kelimenin enter tusu ile aranip aranamayacagi dogrula")
    public void arama_kutusunda_bulunan_kelimenin_enter_tusu_ile_aranip_aranamayacagi_dogrula() throws InterruptedException {

        homePage.searchbox.sendKeys("Zatürre" + Keys.ENTER);


        ReusableMethods.waitFor(3);

    }


    @Given("Arama kutusunda bulunan arama butonunun gorunurlugu ve tiklanilabilirligi dogrula")
    public void arama_kutusunda_bulunan_arama_butonunun_gorunurlugu_ve_tiklanilabilirligi_dogrula() {


        homePage.searchbox.sendKeys("Zatürre");
        homePage.searchbuttonhomepage.click();

        Driver.getDriver().navigate().back();
        ReusableMethods.waitFor(3);

    }


    @Given("Kapatma carpisi gorunurlugu dogrula")
    public void kapatma_carpisi_gorunurlugu_dogrula() {

        Driver.getDriver().get(ConfigReader.getProperty("acibademHastaneleri_url"));
        homePage.searchtext.click();
        ReusableMethods.waitFor(3);

        homePage.closeopen.click();


    }



}
