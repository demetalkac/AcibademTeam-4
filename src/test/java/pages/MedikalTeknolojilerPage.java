package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MedikalTeknolojilerPage {//homepagedeki araliklar belirtildi



    @FindBy(xpath = "//select[@id='location']")
    public WebElement ddmLokasyon;

    @FindBy(xpath = "//select[@id='unit']")
    public WebElement ddmBirim;

    @FindBy(xpath = "//select[@id='technologyType']")
    public WebElement ddmCihaz;

    @FindBy(xpath = " (//*[@title='MEDİKAL TEKNOLOJİLER'])[1]")
    public WebElement medikalTeknolojiler;


    @FindBy(xpath = "(//*[@class='text'])[16]")
    public WebElement cihazMr;
}
