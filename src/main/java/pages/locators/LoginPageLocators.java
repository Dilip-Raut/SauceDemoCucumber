package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	 
    @FindBy(name = "user-name")
    public WebElement userName;
  
    @FindBy(name = "password")
    public WebElement password;
     
    @FindBy(name = "login-button")
    public WebElement login;
  
    @FindBy(xpath = "//h3[contains(text(),'Username and password')]")
    public  WebElement errorMessage;
        
    @FindBy(xpath = "//h3[contains(text(),'Username is')]")
    public WebElement missingUsernameErrorMessage;
}
