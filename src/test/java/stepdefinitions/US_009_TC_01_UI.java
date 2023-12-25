package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import pages.IletisimPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_009_TC_01_UI {

    HomePage homePage = new HomePage();
    IletisimPage iletisimPage = new IletisimPage();


    @Given("user goes to the {string}")
    public void user_goes_to_the(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }
    @Given("user clicks on iletisim option")
    public void user_clicks_on_iletisim_option() {
        ReusableMethods.waitFor(3);
     homePage.iletisimButton.click();
        ReusableMethods.waitFor(3);

    }
    @Given("user clicks on Yol Tarifi Alın button")
    public void user_clicks_on_yol_tarifi_alın_button() {


        iletisimPage.yolTarifiAlinirButton.click();
    }

    @Then("verify user should see Google Map page")
    public void verify_user_should_see_google_map_page() {
        ReusableMethods.waitFor(3);
      // Driver.clickWithJS(iletisimPage.googleMapPopup);
        Driver.switchToWindow2(1);
        Driver.scrollEndJS();
        iletisimPage.googleMapPopup.click();
        ReusableMethods.waitFor(3);

      // iletisimPage.googleMapPopup.click();
       String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "kalkış: Konumunuz varış: Acıbadem Ataşehir Genel Müdürlük - Google Haritalar";
        Assert.assertEquals(actualTitle,expectedTitle);

    }


}
