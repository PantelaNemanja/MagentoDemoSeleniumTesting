package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WhatsNewPage extends BasePage{

    public WhatsNewPage (WebDriver driver){
        super(driver);
    }

    By pheobeZipperButtonBy=By.xpath("/html/body/div[2]/main/div[4]/div[1]/div[2]/div[3]/div/div/ol/li[1]/div/div/strong/a");



public WhatsNewPage navigateToLumasLatestPheobeZipper(){

    clickElement(pheobeZipperButtonBy);

    return this;
}



    
}
