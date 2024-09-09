package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

	
	@FindBy(xpath = "//div[contains(text(),'Swag Labs')]")
    public  WebElement homePageUserLogo;
	
	@FindBy(xpath = "//button[@type='button']")
    public  WebElement homePageSideOpt;
	
	@FindBy(xpath = "//a[text()='Logout']")
    public  WebElement userLogout;
	
}
