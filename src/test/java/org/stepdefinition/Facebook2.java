package org.stepdefinition;

import org.base.classes.BaseClass;
import org.facebook_Pojo.Facebook_Pojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebook2 extends BaseClass {

	Facebook_Pojo fp2;

	@Given("Going to launch Browser")
	public void going_to_launch_Browser() {
		browserLaunch();
		maxWindow();
	}

	@When("Launching the URL")
	public void launching_the_URL() {

		//Facebook_Pojo fp2 = new Facebook_Pojo();

		launchURL("https://www.facebook.com/");

	}

	@When("Passing userName Value from Tables {string}")
	public void passing_userName_Value_from_Tables(String newRef) {

		fp2 = new Facebook_Pojo();
		sendText(fp2.getUserName(), newRef);

	}

	@When("Passing passWord Value from Tables {string}")
	public void passing_passWord_Value_from_Tables(String pass) {
		sendText(fp2.getPassWord(), pass);

	}

	@When("Clicking Login Button")
	public void clicking_Login_Button() {

		click(fp2.getLogIn());
	}

	@Then("Closing the Browser")
	public void closing_the_Browser() {

		driver.close();

	}

}
