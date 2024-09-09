package stepss;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.HomePageActions;
import pages.actions.LoginPageActions;
import utils.SeleniumDriver;


public class LoginPageDefinitions {

	LoginPageActions objLogin = new LoginPageActions();
	HomePageActions objHomePage = new HomePageActions();	
	
	@Given("User is on sauceDemo page {string}")
	public void user_is_on_sauce_demo_page(String url) throws InterruptedException {
		SeleniumDriver.openPage(url);
		Thread.sleep(2000);
	}

	@When("User entered username as {string} and Password as {string}")
	public void user_entered_username_as_and_password_as(String userName, String passWord) throws InterruptedException {
		objLogin.login(userName, passWord);
		Thread.sleep(2000);
	}

	@And("User click on sign in button")
	public void user_click_on_sign_in_button() throws InterruptedException {
		objLogin.clickLogin();
		Thread.sleep(2000);
	}

	@Then("Validate the logo after login")
	public void validate_the_logo_after_login() throws InterruptedException {
	   Assert.assertTrue(objHomePage.getHomePageLogoText().contains("Swag Labs"));
	   Thread.sleep(2000);
	
	}

	@And("User is logout from Application")
	public void user_is_logout_from_application() throws InterruptedException {
	    objHomePage.clickonSideOpt();
	    Thread.sleep(2000);
	    objHomePage.clickonLogout();
	    Thread.sleep(2000);
	}
	
	@Then("User should be able to see error message {string}")
	public void user_should_be_able_to_see_error_message(String expectedErrorMessage) throws InterruptedException {
		System.out.println("Error Msg For Wrong Credentials - "+expectedErrorMessage);
        Assert.assertEquals(objLogin.getErrorMessage(),expectedErrorMessage);
        Thread.sleep(2000);
	}
	
	@Then("User should be able to see a message {string}")
	public void user_should_be_able_to_see_a_message(String missingUserMsg) throws InterruptedException {
		 System.out.println("System Generated User Missing Msg is - "+objLogin.getUserMssingErrorMessage());
	        Assert.assertEquals(objLogin.getUserMssingErrorMessage(),missingUserMsg);
	        Thread.sleep(2000);

	}
	
}
