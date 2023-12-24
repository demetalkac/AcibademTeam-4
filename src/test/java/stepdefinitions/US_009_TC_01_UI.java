package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.IletisimPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_009_TC_01_UI {

    HomePage homePage = new HomePage();
    IletisimPage iletisimPage = new IletisimPage();
    Actions action = new Actions(Driver.getDriver());

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

       // action.scrollToElement(iletisimPage.yolTarifiAlinirButton).perform();

        iletisimPage.yolTarifiAlinirButton.click();
    }


}
