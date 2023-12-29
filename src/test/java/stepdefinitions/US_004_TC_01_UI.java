package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.MedikalTeknolojilerPage;
import utilities.ReusableMethods;

public class US_004_TC_01_UI {

    MedikalTeknolojilerPage medikalPage = new MedikalTeknolojilerPage();


    @Then("anasayfada Medikal Teknolojiler'e tiklar")
    public void anasayfadaMedikalTeknolojilerETiklar() {

        medikalPage.medikalTeknolojiler.click();

    }


    @Then("Tum Birimler dropdownundan {string} secer")
    public void tumBirimlerDropdownundanSecer(String arg0) {



    }

    @Then("Tum Teknolojiler dropdownundan cihaz turunu secer secer")
    public void tumTeknolojilerDropdownundanCihazTurunuSecerSecer() {

        medikalPage.ddmCihaz.click();
        ReusableMethods.ddmVisibleText(medikalPage.ddmCihaz,"Tanı");
    }



    @And("cihazi secer")
    public void cihaziSecer() {

        medikalPage.cihazMr.click();

    }


}
