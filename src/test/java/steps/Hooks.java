package steps;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.SeleniumDriver;

public class Hooks{

	@Before
	public static void setUp() {
		SeleniumDriver.setUpDriver();
	}

	@After
	public void takeScraenshotOnFailure(Scenario scenario) {

		if (scenario.isFailed()) {

		TakesScreenshot ts = (TakesScreenshot) SeleniumDriver.getDriver();

		 byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
		 scenario.attach(screenshot, "image/png", scenario.getName());
		//scenario.attach(screenshot, "image/png", "screenshot");
		}else {
			TakesScreenshot ts = (TakesScreenshot) SeleniumDriver.getDriver();

			 byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
			 scenario.attach(screenshot, "image/png", scenario.getName());
		}

		
		SeleniumDriver.tearDown();
		}
	
	/*
	 * @After public static void tearDown(Scenario scenario) {
	 * 
	 * 
	 * WebDriver driver=SeleniumDriver.getDriver();
	 * System.out.println(scenario.isFailed()); if (scenario.isFailed()) { byte[]
	 * screenshotBytes =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	 * scenario.attach(screenshotBytes, "image/png",scenario.getName()); }
	 * 
	 * 
	 * SeleniumDriver.tearDown(); }
	 */
	
}
