package FeaturesRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "C:\\Users\\User\\workspace\\POMC\\src\\main\\java\\FeaturesRunner\\Amazon.feature",
  
 plugin={"pretty","html:target/cucumber-html-report",
		    "json:target/cucumber.json","junit:target/cucumber.xml",
		    "rerun:target/rerun.txt"},
		 glue={"Stepdefinitions"},
		 monochrome = true,
		 strict=false,
		// tags={"~@Sanity" , "@regressionTest"},
		dryRun=false


 )
public class runner {

}
