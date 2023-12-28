package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_002_TC_01_UI {


    HomePage homePage = new HomePage();
    Actions actions= new Actions(Driver.getDriver());


    @Given("Hastaneler sekmesine tikla")
    public void hastaneler_sekmesine_tikla() {

        homePage.hastanelertotab.click();
        ReusableMethods.waitFor(3);

    }


    @Given("Filtreleme Siralama, Lokasyon Turu secenekleri gor ve sec")
    public void filtreleme_siralama_lokasyon_turu_secenekleri_gor_ve_sec() {



        ReusableMethods.waitFor(3);

        actions.moveToElement(homePage.filterandsorted).perform();

        ReusableMethods.waitFor(3);
        homePage.filterandsorted.isDisplayed();
        ReusableMethods.waitFor(3);

        actions.moveToElement(homePage.alfabetik).perform();
        ReusableMethods.waitFor(3);

        homePage.alfabetik.click();

        ReusableMethods.waitFor(3);

        actions.moveToElement(homePage.tumu).perform();
        homePage.tumu.click();

        ReusableMethods.waitFor(3);

        actions.moveToElement(homePage.hastane).perform();
        homePage.hastane.click();


        ReusableMethods.waitFor(3);

        actions.moveToElement(homePage.tipmerkezi).perform();
        homePage.tipmerkezi.click();



        ReusableMethods.waitFor(3);

        actions.moveToElement(homePage.hpofisleri).perform();
        homePage.hpofisleri.click();


        ReusableMethods.waitFor(3);

        actions.moveToElement(homePage.yurtdisi).perform();
        homePage.yurtdisi.click();

    }




    @Given("Konum acik olmadiginda en yakin konum secenegi secilemez olmali")
    public void konum_acik_olmadiginda_en_yakin_konum_secenegi_secilemez_olmali() {

        ReusableMethods.waitFor(3);

        actions.moveToElement(homePage.enyakinkonum).perform();
        homePage.enyakinkonum.isDisplayed();

    }

    @And("Daha iyi bir deneyim icin konum izni vermelisiniz. cumlesi gorulur olmali")
    public void dahaIyiBirDeneyimIcinKonumIzniVermelisinizCumlesiGorulurOlmali() {

        ReusableMethods.waitFor(3);

        homePage.dahaiyideneyimicinkonum.isDisplayed();

    }



    @Given("Gorulen secenekler secilebilir olmali")
    public void gorulen_secenekler_secilebilir_olmali() {

        ReusableMethods.waitFor(3);

        actions.moveToElement(homePage.tumu).perform();
        homePage.tumu.click();

        ReusableMethods.waitFor(3);

        homePage.gorulensecenek.isDisplayed();



    }



}
