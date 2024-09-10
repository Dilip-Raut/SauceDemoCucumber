package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"pretty", "html:target/HTMLReport/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
			      tags= "@valid",
				 features = "src/test/resources/features/LoginPage.feature", 
				 glue ="steps"
				 )

public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
}
