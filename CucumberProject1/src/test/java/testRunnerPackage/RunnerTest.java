package testRunnerPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature_files/application.feature", 
glue= {"testRunner"},
monochrome =true,plugin = {  "pretty",
"html:target/cucumber-html-report","json:target/cucumber.json",
},

 publish = true)

public class RunnerTest 

{
	
	


}
