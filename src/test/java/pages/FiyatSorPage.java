package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FiyatSorPage {
    public FiyatSorPage(){ PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath ="//li[@id='active']//a[1]")
    public WebElement iletisim;

    @FindBy(xpath = "//div[@data-tab='fiyat-sor']")
    public WebElement fiyatSor;

    @FindBy(id = "AskPriceContactForm_Firstname")
    public WebElement Adiniz;

    @FindBy(id = "AskPriceContactForm_Lastname" )
    public WebElement soyAdiniz;

    @FindBy(id = "AskPriceContactForm_Email")
    public WebElement email;

    @FindBy(id="AskPriceContactForm_Phone")
    public WebElement contactPhone;

    @FindBy(id = "AskPriceContactForm_HospitalName")
    public WebElement hastaneSeciniz;

    @FindBy(css = "option[value='Adana Hastanesi']")
    public WebElement adanaHastanesi;

    @FindBy(id = "selectSubject")
    public WebElement sigortaDurumu;

    @FindBy(css = "option[value='Yok']")
    public WebElement sigortaYok;

    @FindBy(id = "AskPriceContactForm_Message")
    public WebElement Mesajiniz;

    @FindBy(id = "KvkkFiyat")
    public WebElement fiyatBilgilendirme;

    @FindBy(id = "EtkFiyat")
    public WebElement bilgilendirmeBox;


}
