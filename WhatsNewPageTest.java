package Tests;


import org.junit.Test;
import Pages.HomePage;
import Pages.WhatsNewPage;
import Pages.SignInPage;


public class WhatsNewPageTest extends BaseTests {

    //INTERNI LICNI TEST DA PRATIM RAZVOJ STRANICE I NAVIGACIJE


    @Test
    public void navigateToWhatsNewSectin(){

       HomePage homePage = new HomePage(driver);
       SignInPage signInPage = new SignInPage (driver);

        homePage.goToHomePage();
        signInPage.navigateToSignInLinkButton();
        signInPage.signInAlreadyCratedUser(validEmail, validPassword);
        
        try {homePage.navigateToWhatsNewSection();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

}

// LICNI TEST DA SE UVERIM DA MOGU DA LOCIRAM PROIZVOD-TREBA MI ZA POSLEDNJI ZADATAK

@Test
public void navigationToLumasLatestPheobeZipper(){

   HomePage homePage = new HomePage(driver);
   SignInPage signInPage = new SignInPage (driver);
   WhatsNewPage whatsNewPage=new WhatsNewPage(driver);

    homePage.goToHomePage();
    signInPage.navigateToSignInLinkButton();
    signInPage.signInAlreadyCratedUser(validEmail, validPassword);
    homePage.navigateToWhatsNewSection();
    
    whatsNewPage.navigateToLumasLatestPheobeZipper();
    
    
}



}
