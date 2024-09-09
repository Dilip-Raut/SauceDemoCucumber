package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.LoginPageLocators;
import utils.SeleniumDriver;



public class LoginPageActions {

	LoginPageLocators loginPageLocators = null;

	public LoginPageActions() {

		this.loginPageLocators = new LoginPageLocators();

		PageFactory.initElements(SeleniumDriver.getDriver(), loginPageLocators);
	}

	// Get the Error CompleteMessage
	public String getErrorMessage() {
		return loginPageLocators.errorMessage.getText();
	}

	// Get the Error UserMissingMessage
		public String getUserMssingErrorMessage() {
			return loginPageLocators.missingUsernameErrorMessage.getText();
		}
	public void login(String strUserName, String strPassword) {

		loginPageLocators.userName.sendKeys(strUserName);
		loginPageLocators.password.sendKeys(strPassword);
		

	}
	public void clickLogin() {
		loginPageLocators.login.click();
	}
	
	
}
