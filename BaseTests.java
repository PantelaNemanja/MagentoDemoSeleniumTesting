package Tests;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {
    
    public WebDriver driver;
    
    
    //OVDE LOCIRANI JER KORISTIM SVUDA VALIDNOG USERA

    //UKOLIKO BUDETE HTELI DA KREIRATE NOVOG USERA, SAMO DODAJTE NA PRIMER NEKI BROJ ISPRED @

    String validEmail="pantelicnemanja95@gmail.com";
    String validPassword="pantelaNP1";
    String validPassword1="pantelaNP1";


    
//////////////ZADATAK 1.1 MAXIMIZIRATI GOOGLE CHROME PROZOR
//OVDE JE LOCIRAN JER MI TREBA DA PRILIKOM POKRETANJA SVAKOG TESTA, OTVORI MAX PROZOR
    @Before
    public void setUp(){

        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    
    @After
    public void tearDown(){
        driver.quit();
    }
}



