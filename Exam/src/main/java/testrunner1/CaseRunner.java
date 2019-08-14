package testrunner1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features ="Feature", glue = {"StepDefinition"}, tags = {"@tag10"})
public class CaseRunner {

}
