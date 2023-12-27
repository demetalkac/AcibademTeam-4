package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage(){ PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "(//a[@href='/iletisim/'])[1]")
    public WebElement iletisimButton;











    //US01 TC01

    @FindBy(xpath ="//input[@id='search']")
    public WebElement searchbox;

    @FindBy(xpath ="//span[text()='Size nasıl yardımcı olabiliriz?']")
    public WebElement searchtext;

    @FindBy(xpath ="(//button[@type='submit'])[1]")
    public WebElement searchbuttonhomepage;

    @FindBy(xpath ="//a[@title='Zatürre (Pnömoni)']")
    public WebElement zaturreoptions1;

    @FindBy(xpath ="//a[@title='Zatürre (Pnömoni) - Nedenleri']")
    public WebElement zaturreoptions2;

    @FindBy(xpath ="//a[@title='Zatürre (Pnömoni) - Belirtiler']")
    public WebElement zaturreoptions3;

    @FindBy(xpath ="//span[@class='close open']")
    public WebElement closeopen;



    //US02 TC01

    @FindBy(xpath ="//a[@href='/hastaneler/']")
    public WebElement hastanelertotab;

    @FindBy(xpath ="//strong[text()='FİLTRELEME / SIRALAMA']")
    public WebElement filterandsorted;


    /*


    @FindBy(xpath ="")
    public WebElement ;

    @FindBy(xpath ="")
    public WebElement ;

    @FindBy(xpath ="")
    public WebElement ;

    @FindBy(xpath ="")
    public WebElement ;

    */
















//sonrakiler-fatma hoca


































//mehmet hoca


































//kadir hoca







































    //kübra hoca































































}
