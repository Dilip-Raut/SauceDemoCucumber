package utils;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {

	private static SeleniumDriver seleniumDriver;
	
	//Initialize  WebDriver
	private static WebDriver driver;
	
	public static WebDriverWait waitDriver;
	public final static int TIMEOUT=40;
	public final static int PAGE_LOAD_TIMEOUT=60;
	
	private SeleniumDriver() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		waitDriver=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}
	
	
	public static void openPage(String url) {
		driver.get(url);
	}
	
	public static WebDriver getDriver() {
		return driver;
		
	}
	
	public static void setUpDriver() {
		if(seleniumDriver==null) {
			seleniumDriver =new SeleniumDriver();
		}
		
	}
	
	
	public static void tearDown() {
		if(driver !=null) {
			driver.close();
			driver.quit();
		}
		seleniumDriver=null;
	}
	
}
