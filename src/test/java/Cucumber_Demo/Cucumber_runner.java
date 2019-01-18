package Cucumber_Demo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="Feature",
		glue= {"Step_Def"}
		
		
		)

public class Cucumber_runner {

}
