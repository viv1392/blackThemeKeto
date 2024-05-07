package runnerPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= ".//featureFiles/RegistrationWCmFeetInch.feature",
		glue= {"stepDefnations","hooks"},
		monochrome= true,
		dryRun=false,
		plugin= {"pretty","html:target/CucumberReports/CucumberReport.html"}
		//tags= " @WomenRegistrationNonVegVariableTargetWeight"
		
		)
		
public class RunnerClass {


}
