package org.stepdefinition;

import org.base.classes.BaseClass;
import org.facebook_Pojo.Facebook_Pojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebook extends BaseClass {

	Facebook_Pojo fp;

	@Given("Going to Launch the ChromeBrowser and Maximize the Window")
	public void going_to_Launch_the_ChromeBrowser_and_Maximize_the_Window() {

		browserLaunch();
		maxWindow();

	}

	@When("Launching the Current URL")
	public void launching_the_Current_URL() {

		launchURL("https://www.facebook.com/");
	}

	@When("Passing UserName in UserName textbox")
	public void passing_UserName_in_UserName_textbox() {

		fp = new Facebook_Pojo();

		sendText(fp.getUserName(), "Jeni");

	}

	@When("Passing Password in Password textbox")
	public void passing_Password_in_Password_textbox() {

		sendText(fp.getPassWord(), "jeni@123");
	}

	@When("Finally Clicking Login Key")
	public void finally_Clicking_Login_Key() {

		click(fp.getLogIn());

	}

	@Then("Closing The Browser")
	public void closing_The_Browser() {

		driver.close();

	}

}
