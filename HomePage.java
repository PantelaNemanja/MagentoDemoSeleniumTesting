package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    
    public HomePage (WebDriver driver){
        super(driver);
    }

    String homeUrl="https://magento.softwaretestingboard.com";
    By singleProductElementBy=By.xpath("//div[@class='product-item-info']");
    int expectedNumberOfProducts;
    By actualMsgUserSignedOutBy=By.xpath("//span[@class='not-logged-in']");
    By whatsNewSectionButtonBy=By.id("ui-id-3");


    public HomePage goToHomePage(){

        driver.get(homeUrl);

        return this;
    }


    public HomePage countElementsinHotSellers (int expectedNumberOfProducts){

        int actualCountonPage=countNumberOfElements(singleProductElementBy);
        
        verifyNumberOfElements(expectedNumberOfProducts, actualCountonPage);
        
        return this;
        
        }


///////////////LOG OUT verifikacija
        public HomePage verifySeccesfullLogedOutUser (String expectedMsgUserSignedOut){
            String actualMsgUserSignedOut;
            waitElemetToBeVisible(actualMsgUserSignedOutBy);
            actualMsgUserSignedOut=readText(actualMsgUserSignedOutBy);
            
            verifyTextIsTheSame(expectedMsgUserSignedOut,actualMsgUserSignedOut);
            return this;
        
        }

//////////////WHATS NEW Page

public HomePage navigateToWhatsNewSection(){

clickElement(whatsNewSectionButtonBy);

    return this;
}
}
