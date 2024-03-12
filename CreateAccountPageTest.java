package Tests;

import org.junit.Test;
import Pages.HomePage;
import Pages.CreateAccountPage;


public class CreateAccountPageTest extends BaseTests{

///------------------ZADATAK 3 ------------------- 


    @Test
    public void verifyNavigationToCreateAccountPage(){

       HomePage homePage = new HomePage(driver);
       CreateAccountPage createAccountPage = new CreateAccountPage(driver);

        homePage.goToHomePage();
        createAccountPage.navigateToCreateAccountButton();
        createAccountPage.addPersonalInfoToCreateAccount(validEmail,validPassword,validPassword1);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    
}



}