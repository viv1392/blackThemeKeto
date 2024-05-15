package runnerPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= ".//featureFiles",
		glue= {"stepDefnations","hooks"},
		monochrome= true,
		dryRun=false,
		plugin= {"pretty","html:target/CucumberReports/CucumberReport.html"}
		//tags= "@WomenRegistrationVegetarian"
		
		)
		
public class RunnerClass {


}
