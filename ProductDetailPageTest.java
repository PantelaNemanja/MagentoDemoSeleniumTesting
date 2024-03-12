package Tests;


import org.junit.Test;
import Pages.HomePage;
import Pages.ProductDetailPage;
import Pages.WhatsNewPage;
import Pages.SignInPage;

public class ProductDetailPageTest extends BaseTests {
    
//////////////////ZADATAK 5 UBACITI U KART JEDAN PROIZVODA SA WHATS NEW SEKCIJE- SA PDP PROIZVODA U KART
    @Test
    public void addToCartPheobeZipperXsPink(){

       HomePage homePage = new HomePage(driver);
       SignInPage signInPage = new SignInPage (driver);
       WhatsNewPage whatsNewPage=new WhatsNewPage(driver);
       ProductDetailPage productDetailPage=new ProductDetailPage(driver);


        homePage.goToHomePage();
        signInPage.navigateToSignInLinkButton();
        signInPage.signInAlreadyCratedUser(validEmail, validPassword);
        homePage.navigateToWhatsNewSection();
        
        whatsNewPage.navigateToLumasLatestPheobeZipper();
        productDetailPage.choseSizeColorQtyPheobeZipper();
        //productDetailPage.shopingCartNavigation();   Probao da vidim da li nastavlja test dalje na Shoping cart
       

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        

}
}