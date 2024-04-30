package runnerPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= ".//featureFiles/blackTheme.feature",
		glue= "stepDefnations",
		monochrome= true,
		dryRun=false,
		plugin= {"pretty","html:test-output"}
		)
		
		

public class RunnerClass {


}
