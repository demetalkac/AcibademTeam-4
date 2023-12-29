package stepdefinitions;


import io.cucumber.java.en.*;

import org.openqa.selenium.interactions.Actions;

import pages.DoktorlarPage;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;



public class US_003_TC_01_UI {

    DoktorlarPage doktorlarPage= new DoktorlarPage();
    Actions actions= new Actions(Driver.getDriver());

    @Given("kullanici anasayfaya gider")
    public void kullanici_anasayfaya_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("acibademHastaneleri_url"));

    }
    @Then("kullanici anasayfada doktorlar basligina tiklar")
    public void kullanici_anasayfada_doktorlar_basligina_tiklar() {

        doktorlarPage.doktorlar.click();


    }
    @Then("kullanici doktorlar sayfasi acilana kadar bekler")
    public void kullanici_doktorlar_sayfasi_acilana_kadar_bekler() {

      //  ReusableMethods.visibleWait(doktorlarPage.doktorlar,1);

    }
    @Then("acilan sayfayi asagi kaydirir")
    public void acilan_sayfayi_asagi_kaydirir() {

        ReusableMethods.scroll(doktorlarPage.ddmDoktorlarListesi);
    }

    @Then("Tum Lokasyonlar dropdownundan hastaneyi secer")
    public void tum_lokasyonlar_dropdownundan_hastaneyi_secer() {

      ReusableMethods.ddmVisibleText(doktorlarPage.ddmLokasyon, "Fulya Hastanesi");
    }
    @Then("sayfa acilana kadar bekler")
    public void sayfa_acilana_kadar_bekler() {

        ReusableMethods.waitFor(3);

    }
    @Then("Tum Birimler dropdownundan birim secer")
    public void tum_birimler_dropdownundan_birim_secer() {

        doktorlarPage.ddmBirim.click();
        ReusableMethods.ddmVisibleText(doktorlarPage.ddmBirim,"Acil Servis");

    }

    @Then("Tum Doktorlar dropdownundan doktor secer")
    public void tum_doktorlar_dropdownundan_doktor_secer() {

        doktorlarPage.ddmDoktorlarListesi.click();
       ReusableMethods.ddmVisibleText(doktorlarPage.ddmDoktorlarListesi, "Doktor");



    }
    @Then("doktoru sec")
    public void doktoru_sec() {

       // doktorlarPage.doktor.click();

        JSUtils.clickElementByJS(doktorlarPage.doktor);
    }



}
