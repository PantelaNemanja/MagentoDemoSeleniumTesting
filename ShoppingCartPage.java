package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends BasePage{
    public ShoppingCartPage (WebDriver driver){
        super(driver);
    }

    By readSubTotalPriceTextbBy=By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/div[2]/div/table/tbody/tr[1]/td/span");
    By flatRateFixBy=By.id("s_method_flatrate_flatrate");
    By readFinalTotalPriceTextBy=By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/div[2]/div/table/tbody/tr[3]/td/strong/span");
    By expandTaxListOnCartPageBy=By.xpath("//div[@id='block-shipping']");
    By flatRateFixPriceBy=By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/div[1]/div[2]/form[2]/fieldset/dl/dd[2]/div/label/span/span");

   public ShoppingCartPage verifySubTotalAndFinalTotalPrice (){

    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    clickElement(expandTaxListOnCartPageBy);


    String subTotalPriceText;
    subTotalPriceText=readText(readSubTotalPriceTextbBy).substring(1);
    double convertedActualSubTotalPrice;
    convertedActualSubTotalPrice=convertTextToNumber(subTotalPriceText);

   

    String flatRateFixPriceText;
    flatRateFixPriceText=readText(flatRateFixPriceBy).substring(1);
    double convertedActualFlatRateFixPrice;
    convertedActualFlatRateFixPrice=convertTextToNumber(flatRateFixPriceText);

    

    double actualSubTotalPrice;
    actualSubTotalPrice=convertedActualSubTotalPrice+convertedActualFlatRateFixPrice;
   
    

    
    
    
    clickElement(flatRateFixBy);

    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    String finalTotalPriceText;
    finalTotalPriceText=readText(readFinalTotalPriceTextBy).substring(1);
    double convertedActualFinalTotalPrice;
    convertedActualFinalTotalPrice=convertTextToNumber(finalTotalPriceText);

   verifyPrice(actualSubTotalPrice, convertedActualFinalTotalPrice ); 
    return this;
   }
}
   