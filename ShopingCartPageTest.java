package Tests;

import org.junit.Test;
import Pages.HomePage;
import Pages.ProductDetailPage;
import Pages.ShoppingCartPage;
import Pages.WhatsNewPage;
import Pages.SignInPage;

public class ShopingCartPageTest extends BaseTests {
    
 ////ZADATAK 6 VERIFIKACIJA TOTAL CENE- ISCITAO SVA TRI STRINGA, KONVERTOVAO U CIFRE, SABRAO DVE I UPOREDIO SA TOTAL


 //ZBOG SPOROG UCITAVANJA MORAO SAM DA OKRUZIM SA TRY CATCH BLOKOVIMA KAKO BI SACEKAO DA SE UCITA I DA GA NADJE PO XPATH
 //POKUSAO SAM DA ISKUCAM MOJE XPAHT ALI NIJE MOGAO DA GA LOCIRA, PA SAM KORISTIO - COPY FULLXPAHT

    @Test
    public void verifyIfReadedandParsedFinalTotalPrice (){
    
        HomePage homePage = new HomePage(driver);
       SignInPage signInPage = new SignInPage (driver);
       WhatsNewPage whatsNewPage=new WhatsNewPage(driver);
       ProductDetailPage productDetailPage=new ProductDetailPage(driver);
       ShoppingCartPage shoppingCartPage= new ShoppingCartPage(driver);


        homePage.goToHomePage();
        signInPage.navigateToSignInLinkButton();
        signInPage.signInAlreadyCratedUser(validEmail, validPassword);
        homePage.navigateToWhatsNewSection();
        whatsNewPage.navigateToLumasLatestPheobeZipper();
        productDetailPage.choseSizeColorQtyPheobeZipper();
        productDetailPage.shopingCartNavigation();
        shoppingCartPage.verifySubTotalAndFinalTotalPrice();
}
}