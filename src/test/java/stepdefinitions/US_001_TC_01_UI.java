package stepdefinitions;

import io.cucumber.java.en.*;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

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



    @Given("Arama kutusuna tikla")
    public void arama_kutusuna_tikla() {

        homePage.searchbox.click();

    }



    @Given("Aranacak kelime arama kutusuna yazilarak -Populer Aramalar-in gorunurlugu dogrula")
    public void aranacak_kelime_arama_kutusuna_yazilarak_populer_aramalar_in_gorunurlugu_dogrula() {



    }



    @Given("Aranacak kelime arama kutusuna yazilarak secilebilecek seceneklerin tiklanabilirligi dogrula")
    public void aranacak_kelime_arama_kutusuna_yazilarak_secilebilecek_seceneklerin_tiklanabilirligi_dogrula() {


    }


    @Given("Aranacak kelime arama kutusuna yazilarak secilebilecek seceneklerin gorunurlugu dogrula")
    public void aranacak_kelime_arama_kutusuna_yazilarak_secilebilecek_seceneklerin_gorunurlugu_dogrula() {

    }



    @Given("Arama kutusunda bulunan kelimenin enter tusu ile aranip aranamayacagi dogrula")
    public void arama_kutusunda_bulunan_kelimenin_enter_tusu_ile_aranip_aranamayacagi_dogrula() {

    }


    @Given("Arama kutusunda bulunan arama butonunun gorunurlugu ve tiklanilabilirligi dogrula")
    public void arama_kutusunda_bulunan_arama_butonunun_gorunurlugu_ve_tiklanilabilirligi_dogrula() {


    }


    @Given("Kapatma carpisi gorunurlugu dogrula")
    public void kapatma_carpisi_gorunurlugu_dogrula() {

    }




}
