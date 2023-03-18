package org.stepdefinition;

import org.base.classes.BaseClass;
import org.facebook_Pojo.ToolQA_Pojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Question_2 extends BaseClass {

	ToolQA_Pojo tq;

	@Given("Launch the Chrome Browser and Maximize")
	public void launch_the_Chrome_Browser_and_Maximize() throws InterruptedException {
		browserLaunch();
		maxWindow();
		launchURL("https://www.toolsqa.com/selenium-training/#enroll-form");
		//Thread.sleep(5000);
	}

	@When("Passing FirstName and LastName in the Required Checkbox")
	public void passing_FirstName_and_LastName_in_the_Required_Checkbox() {
		tq = new ToolQA_Pojo();
		sendText(tq.getFirstName(), "Sathish");
		sendText(tq.getLastName(), "Chidambaram");

	}

	@Then("Closing the Chrome Browser")
	public void closing_the_Chrome_Browser() {

		System.out.println("FirstName and LastName passed Successfully");
		close();

	}

}
