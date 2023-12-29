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

    @FindBy(xpath ="//a[@href='/ilgi-alani/zaturre-pnomoni/']")
    public WebElement populeraramazaturre;

    //US02 TC01

    @FindBy(xpath ="//a[@href='/hastaneler/']")
    public WebElement hastanelertotab;

    @FindBy(xpath ="//strong[text()='FİLTRELEME / SIRALAMA']")
    public WebElement filterandsorted;

    @FindBy(xpath ="(//i[@class='user-layout'])[1]")
    public WebElement enyakinkonum;

    @FindBy(xpath ="(//i[@class='user-layout'])[2]")
    public WebElement alfabetik;

    @FindBy(xpath ="(//i[@class='user-layout'])[3]")
    public WebElement tumu;

    @FindBy(xpath ="(//i[@class='user-layout'])[4]")
    public WebElement hastane;

    @FindBy(xpath ="(//i[@class='user-layout'])[5]")
    public WebElement tipmerkezi;

    @FindBy(xpath ="(//i[@class='user-layout'])[6]")
    public WebElement hpofisleri;

    @FindBy(xpath ="(//i[@class='user-layout'])[7]")
    public WebElement yurtdisi;

    @FindBy(xpath ="//div [@id='locationStatus']")
    public WebElement dahaiyideneyimicinkonum;

    @FindBy(xpath ="(//a[@href='/hastane/adana-hastanesi/'])[2]")
    public WebElement gorulensecenek;
/*

*/


//sonrakiler-fatma hoca


































//mehmet hoca


































//kadir hoca







































    //kübra hoca































































}
