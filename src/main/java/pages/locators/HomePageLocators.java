package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

	
	@FindBy(xpath = "//div[contains(text(),'Swag Labs')]")
    public  WebElement homePageUserLogo;
	
	
	
}
