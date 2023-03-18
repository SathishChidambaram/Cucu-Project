package org.testRun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\sathi\\eclipse-workspace\\Maven_Cucumber\\src\\test\\resources\\Question_Two.feature",
				glue = "org.stepdefinition",
				monochrome = true,
				dryRun = false,
				strict = true
			
		)
public class Question_2_TestRunner {
	
	

}
