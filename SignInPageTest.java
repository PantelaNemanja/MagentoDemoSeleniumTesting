package Tests;

import org.junit.Test;
import Pages.HomePage;

import Pages.SignInPage;

public class SignInPageTest extends BaseTests{
    
String expectedWelcomeMsg="Welcome, Nemanja Pantelic!";
String errorSignMsgBlankInput="This is a required field.";
String expectedErrorSignMsgBadEmailorPass="The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.";
String badEmailForSignIn="pppantelicnemanja@gmail.com";
String badPassForSignIn="pantEE1234";

    
///------------------ZADATAK 4-------------------     


///////////////////////////ZADATAK 4.1 VERIFIKACIJA DA JE KORISNIK ULOGOVAN

@Test
    public void verifyUserIsSignedIn(){

        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage (driver);
 
         homePage.goToHomePage();
         signInPage.navigateToSignInLinkButton();
         signInPage.signInAlreadyCratedUser(validEmail, validPassword);

         try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         signInPage.verifyIfUserIsSingedIn(expectedWelcomeMsg);
    }

/////////////////////ZADATAK 4.2 VERIFIKACIJA PRAZAN E AIL

    @Test
    public void verifyUnsuccessfullSignInEmptyUsername (){
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage (driver);
 
         homePage.goToHomePage();
         signInPage.navigateToSignInLinkButton();
         signInPage.signInAlreadyCratedUser("", validPassword);
         signInPage.verifyUnsuccesfullSignInBlankUsername(errorSignMsgBlankInput);

}


/////////////////////ZADATAK 4.3 VERIFIKACIJA PRAZAN PASWORD

@Test
    public void verifyUnsuccessfullSignInEmptyPassword (){
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage (driver);
 
         homePage.goToHomePage();
         signInPage.navigateToSignInLinkButton();
         signInPage.signInAlreadyCratedUser(validEmail, "");
         signInPage.verifyUnsuccesfullSignInBlankPass(errorSignMsgBlankInput);
}

//////////////ZADATAK 4.4 VERIFIKACIJA SIGN IN-  POGRESAN EMAIL-USER NIJE REGISTROVAN PRETHODNO
@Test
    public void verifyUnsuccessfullSignInBadEmail (){
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage (driver);
 
         homePage.goToHomePage();
         signInPage.navigateToSignInLinkButton();
         signInPage.signInAlreadyCratedUser(badEmailForSignIn, validPassword);

         try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

         signInPage.verifyUnsuccesfullSignInBadEmail(expectedErrorSignMsgBadEmailorPass);
}

//////////////ZADATAK 4.5 VERIFIKACIJA SIGN IN-  POGRESAN PASWORD- USER JE VEC REGISTROVAN 

@Test
    public void verifyUnsuccessfullSignInBadPass (){
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage (driver);
 
         homePage.goToHomePage();
         signInPage.navigateToSignInLinkButton();
         signInPage.signInAlreadyCratedUser(validEmail, badPassForSignIn);

         try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

         signInPage.verifyUnsuccesfullSignInBadPass(expectedErrorSignMsgBadEmailorPass);
}

//////////////////////////// ZADATAK 4.6 NAVIGACIJA LOG OUT FUNKCIJE

@Test
    public void verifySignOutNavigation (){
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage (driver);
 
         homePage.goToHomePage();
         signInPage.navigateToSignInLinkButton();
         signInPage.signInAlreadyCratedUser(validEmail, validPassword);

         

         signInPage.navigationToSignOutButtonLinkinDropList();
}

////////////// ZADATAK 4.7 VERIFIKACIJA DA JE KORISNIK IZLOGOVAN - VERIFIKACIJA SE ODVIJA NA HOME PAGE
@Test
    public void verifyUserIsSignedOut(){
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage (driver);
 
         homePage.goToHomePage();
         signInPage.navigateToSignInLinkButton();
         signInPage.signInAlreadyCratedUser(validEmail, validPassword);
         signInPage.navigationToSignOutButtonLinkinDropList();
         homePage.verifySeccesfullLogedOutUser("Click “Write for us” link in the footer to submit a guest post");
}

}