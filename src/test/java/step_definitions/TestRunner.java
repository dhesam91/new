package step_definitions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		//features = "classpath:features",
		//features = "src/test/resources/features/FlighRegistration.feature",
				//features = "src/test/resources/features/FlightInfo.feature",
						features = "src/test/resources/features",
		
		plugin = {"pretty", "html:target/cucumber-html-report","json:target/Destination/cucumber.json"},
		monochrome = true,
		tags = {}
		)
public class TestRunner{
	
}

//@CucumberOptions( monochrome = true,plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json" })