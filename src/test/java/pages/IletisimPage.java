package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class IletisimPage {
    public  IletisimPage(){PageFactory.initElements(Driver.getDriver(),this); }

        @FindBy(xpath ="//a[@title='Yol Tarifi Alın']")
        public WebElement yolTarifiAlinirButton;



}
