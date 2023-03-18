package org.testRun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\sathi\\eclipse-workspace\\Maven_Cucumber\\src\\test\\resources\\Facebook.feature",
		         glue = "org.stepdefinition",
		         monochrome = true
		         //plugin= {"html:FaceBook_Report","junit:FaceBooReprt1\\Facebook.xml"}
		         //dryRun = true
		         // strict =false
		         )
public class Facebook_TestRunner {
	
	
}
