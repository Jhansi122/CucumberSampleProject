package testRunnerPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/objectRepository/application.properties", glue= {"testRunner"},
plugin = {  "pretty",
"html:target/cucumber-reports/reports" },

 publish = true)

public class RunnerTest 

{
	
	


}
