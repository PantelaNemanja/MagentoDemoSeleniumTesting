package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class ProductDetailPage extends BasePage{
    public ProductDetailPage (WebDriver driver){
        super(driver);
    }

By pheobeZipperSizeXSBy=By.id("option-label-size-143-item-166");
By pheobeZipperColorPinkBy=By.id("option-label-color-93-item-57");
By addToCartButtonOnPdPPheobeBy=By.id("product-addtocart-button");
By cartIconBy=By.xpath("/html/body/div[2]/header/div[2]/div[1]/a");
By viewAndEditCartButtonBy=By.xpath("/html/body/div[2]/header/div[2]/div[1]/div/div/div/div[2]/div[5]/div/a/span");


public ProductDetailPage choseSizeColorQtyPheobeZipper(){

    clickElement(pheobeZipperSizeXSBy);
    clickElement(pheobeZipperColorPinkBy);
    clickElement(addToCartButtonOnPdPPheobeBy);

    return this;
}


///////////Shopping Cart page navigation

public ProductDetailPage shopingCartNavigation(){

    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    clickElement(cartIconBy);

    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    clickElement(viewAndEditCartButtonBy);
   
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    return this;
}

}
