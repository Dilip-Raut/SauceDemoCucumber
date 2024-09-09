package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.HomePageLocators;
import utils.SeleniumDriver;

public class HomePageActions {

	HomePageLocators homePageLocators = null;
	 
    public HomePageActions() {
 
        this.homePageLocators = new HomePageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(),homePageLocators);
    }
 
    public String getHomePageLogoText() {
        return homePageLocators.homePageUserLogo.getText();
    }
    
    public void clickonSideOpt() {
    	homePageLocators.homePageSideOpt.click();
    }
    
    public void clickonLogout() {
    	homePageLocators.userLogout.click();
    }
    
}
