package testRunnerPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Program Files\\Selenium\\Spring tool suite\\Code\\CucumberProject1\\src\\main\\java\\Feature Files\\Application.feature", glue= {"stepDefinition"})
public class RunnerTest 
{
	
	


}
