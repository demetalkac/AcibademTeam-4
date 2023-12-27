package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import pages.FiyatSorPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_005_TC_01_UI {
        FiyatSorPage fiyatSorPage = new FiyatSorPage();

    @Given("Go to homepage")
    public void go_to_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("acibademHastaneleri_url"));
        ReusableMethods.waitFor(1);
    }
    @Then("Click on Iletisim button")
    public void click_on_menu_button() {
        fiyatSorPage.iletisim.click();
        ReusableMethods.waitFor(1);


    }
    @Then("Click on {string} button")
    public void click_on_button(String string) {
            JavascriptExecutor jsExecutor = (JavascriptExecutor) fiyatSorPage;
            jsExecutor.executeScript("window.scrollBy(0, " + 500 + ");");
        } ;

    @Then("Enter your name into the {string} field")
    public void enter_your_name_into_the_field(String string) {

    }
    @Then("Enter your surname into the {string} field")
    public void enter_your_surname_into_the_field(String string) {

    }
    @Then("Enter your email address into the {string} field")
    public void enter_your_email_address_into_the_field(String string) {

    }
    @Then("Enter your telephone number into the {string} field")
    public void enter_your_telephone_number_into_the_field(String string) {

    }
    @Then("Select the hospital banch from {string}")
    public void select_the_hospital_banch_from(String string) {

    }
    @Then("Select your insurance status from {string}")
    public void select_your_insurance_status_from(String string) {

    }
    @Then("Enter your message into the {string} field")
    public void enter_your_message_into_the_field(String string) {

    }
    @Then("Enter the {int} digit number in the {string} field")
    public void enter_the_digit_number_in_the_field(Integer int1, String string) {

    }
    @Then("Click on the {string} button")
    public void click_on_the_button(String string) {

    }
    @Then("Verifies that the message has been sent")
    public void verifies_that_the_message_has_been_sent() {

    }
}
