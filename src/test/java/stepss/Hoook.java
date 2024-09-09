package stepss;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.SeleniumDriver;

public class Hoook{

	@Before
	public static void setUp() {
		SeleniumDriver.setUpDriver();
	}

	@After
	public static void tearDown(Scenario scenario) {
		
		
		/*
		 * WebDriver driver=SeleniumDriver.getDriver();
		 * System.out.println(scenario.isFailed()); if (scenario.isFailed()) { byte[]
		 * screenshotBytes =
		 * ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		 * scenario.attach(screenshotBytes, "image/png",scenario.getName()); }
		 * 
		 */ 		 
		SeleniumDriver.tearDown();
	}

}
