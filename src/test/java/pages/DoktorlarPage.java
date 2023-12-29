package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class DoktorlarPage {//homepagedeki araliklar belirtildi





    @FindBy(xpath = "//select[@id='location']")
    public WebElement ddmLokasyon;

    @FindBy(xpath = "//select[@id='unit']")
    public WebElement ddmBirim;


    @FindBy(xpath = "//select[@id='doctorType']")
    public WebElement ddmDoktorlar;































}
