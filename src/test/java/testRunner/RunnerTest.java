package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/resources/features"},
				glue  = {"stepDefinition"},
		//tags = "@sanity",
		monochrome  = true , 	
		plugin = {"pretty" , "json:target/myReports/report.json",
				  "junit:target/myReports/report.xml",
				   "html:target/myReports/report.html"
				},
		publish = true
		//dryRun = true
			
		)
public class RunnerTest {

}
