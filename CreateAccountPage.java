package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage extends BasePage{

    public CreateAccountPage (WebDriver driver){
        super(driver);
    }
    
    By createAccountButtonBy=By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a");
    By firstNameOnPIsectionBy=By.id("firstname");
    By lastNamenPIsectionBy=By.id("lastname");
    By eMailSignInInfoSectionBy=By.id("email_address");
    By passwordSignInInfoSectionBy=By.id("password");
    By passwordConfirmationSignInInfoSectionBy=By.id("password-confirmation");
    By buttonSubmitCreateAccountBy=By.xpath("/html/body/div[2]/main/div[3]/div/form/div/div[1]/button/span");
    
  

    public CreateAccountPage navigateToCreateAccountButton (){
    clickElement(createAccountButtonBy);
    return this;
    }



    public CreateAccountPage addPersonalInfoToCreateAccount(String validEmail, String validPassword, String validPassword1){
    enterText(firstNameOnPIsectionBy, "Nemanja");
    enterText(lastNamenPIsectionBy, "Pantelic");
    enterText(eMailSignInInfoSectionBy,validEmail);
    enterText(passwordSignInInfoSectionBy, validPassword);
    enterText(passwordConfirmationSignInInfoSectionBy,validPassword1);
    clickElement(buttonSubmitCreateAccountBy);

        return this;
    }

}
