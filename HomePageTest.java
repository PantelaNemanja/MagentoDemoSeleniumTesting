package Tests;
import org.junit.Test;

import Pages.HomePage;


public class HomePageTest extends BaseTests{

///------------------ZADATAK 1.2 -------------------   

    @Test
    public void verifyNavigationToHomePage(){

       HomePage homePage = new HomePage(driver);


               homePage.goToHomePage();
        
}


///------------------ZADATAK 2 ------------------- 

@Test
public void countNumberOfItemsInHottSellers (){

    HomePage homePage = new HomePage(driver);
   
    homePage.goToHomePage();
   
homePage.countElementsinHotSellers(6);

}

}