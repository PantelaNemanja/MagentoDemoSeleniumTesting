package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class SignInPage extends BasePage{

    public SignInPage (WebDriver driver){
        super(driver);
    }
    By signInLinkButtonBy=By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a");
    By signInAlreadyRegisterdUserEmail=By.id("email");
    By signInAlreadyRegisterdUserPaswword=By.id("pass");
    By signInRegisterdUserButtonBy=By.id("send2");
    By actualWelcomeMsgBy=By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[1]/span");
    By actualErrorMsgBlankInputUserBy=By.id("email-error");
    By actualErrorMsgBlankInputPassBy=By.id("pass-error");
    By actualErrorMsgBadEmailorPassBy=By.xpath("/html/body/div[2]/main/div[2]/div[2]/div/div/div");
    By signOutLinkButtonBy=By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a");
    By dropDownButtonForLogOutBy=By.xpath("//button[@class='action switch']");
    
    


    public SignInPage navigateToSignInLinkButton (){
        clickElement(signInLinkButtonBy);
        return this;
        }

        public SignInPage signInAlreadyCratedUser(String validEmail,  String validPassword){
            enterText(signInAlreadyRegisterdUserEmail,validEmail);
            enterText(signInAlreadyRegisterdUserPaswword, validPassword);
            
            clickElement(signInRegisterdUserButtonBy);
        
                return this;
            }
        
    public SignInPage verifyIfUserIsSingedIn(String expectedWelcomeMsg){
        String actualWelcomeMsg;
        waitElemetToBeVisible(actualWelcomeMsgBy);
        actualWelcomeMsg=readText(actualWelcomeMsgBy);
        
        verifyTextIsTheSame(expectedWelcomeMsg,actualWelcomeMsg);
        return this;

    }

    public SignInPage verifyUnsuccesfullSignInBlankUsername(String errorSignMsgBlankInput){

        String actualErrorMsgBlankInputUsername;
        waitElemetToBeVisible(actualErrorMsgBlankInputUserBy);
        actualErrorMsgBlankInputUsername=readText(actualErrorMsgBlankInputUserBy);
        
        verifyTextIsTheSame(errorSignMsgBlankInput,actualErrorMsgBlankInputUsername);
        return this;

    }
    

    public SignInPage verifyUnsuccesfullSignInBlankPass(String errorSignMsgBlankInput){

        String actualErrorMsgBlankInputPass;
        waitElemetToBeVisible(actualErrorMsgBlankInputPassBy);
        actualErrorMsgBlankInputPass=readText(actualErrorMsgBlankInputPassBy);
        
        verifyTextIsTheSame(errorSignMsgBlankInput,actualErrorMsgBlankInputPass);
        return this;

    }



    public SignInPage verifyUnsuccesfullSignInBadEmail(String expectedErrorSignMsgBadEmailorPass){

        String actualErrorMsgBadEmail;
        waitElemetToBeVisible(actualErrorMsgBadEmailorPassBy);
        actualErrorMsgBadEmail=readText(actualErrorMsgBadEmailorPassBy);
        
        verifyTextIsTheSame(expectedErrorSignMsgBadEmailorPass,actualErrorMsgBadEmail);
        return this;

    }



    public SignInPage verifyUnsuccesfullSignInBadPass(String expectedErrorSignMsgBadEmailorPass){

        String actualErrorMsgBadPass;
        waitElemetToBeVisible(actualErrorMsgBadEmailorPassBy);
        actualErrorMsgBadPass=readText(actualErrorMsgBadEmailorPassBy);
        
        verifyTextIsTheSame(expectedErrorSignMsgBadEmailorPass,actualErrorMsgBadPass);
        return this;

    }
//////////////////////////LOG OUT

public SignInPage navigationToSignOutButtonLinkinDropList(){

clickElement(dropDownButtonForLogOutBy);
clickElement(signOutLinkButtonBy);//Probao sam sa SELECT libery(probao ByText, ByValue) ali nije htelo jer su ovi dugmici zamotani u Li klase

    return this;
}



}

    



