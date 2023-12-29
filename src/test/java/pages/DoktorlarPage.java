package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class DoktorlarPage {//homepagedeki araliklar belirtildi


    public DoktorlarPage(){ PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath = "(//*[@title='DOKTORLAR'])[1]")
     public WebElement doktorlar;

    @FindBy(xpath = "//select[@id='location']")
    public WebElement ddmLokasyon;

    @FindBy(xpath = "//select[@id='unit']")
    public WebElement ddmBirim;


    @FindBy(xpath = "//select[@id='doctorType']")
    public WebElement ddmDoktorlarListesi;

    @FindBy(xpath = "(//*[.='Doktor'])[3]")
    public WebElement doktor;































}
