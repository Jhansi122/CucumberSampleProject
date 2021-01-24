package testRunnerPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;






@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature_files/application.feature", 
glue= {"testRunner"},
monochrome =true,   plugin ={  "pretty:target/cucumber-pretty.txt", "html:target/cucumber-reports/reports.html",
		"json:target/cucumber.json"},

dryRun = false,

 publish = true)

public class RunnerTest 

{
	

}
