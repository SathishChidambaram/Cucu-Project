package org.stepdefinition;

import java.io.IOException;

import org.base.classes.BaseClass;
import org.facebook_Pojo.Facebook_Pojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Question11_StepDef extends BaseClass {

	Facebook_Pojo fp11;

	@Given("Launching Chrome")
	public void launching_Chrome() {
		browserLaunch();
		maxWindow();
		launchURL("https://www.facebook.com/");
	}

	@When("Passing Value From Excel to UserName Checkbox")
	public void passing_Value_From_Excel_to_UserName_Checkbox() throws IOException {

		fp11 = new Facebook_Pojo();
		sendText(fp11.getUserName(), excelValueRead(
				"C:\\Users\\sathi\\eclipse-workspace\\Maven_Cucumber\\Excel\\FacebookLogin.xlsx", "Sample", 0, 0));

	}

	@When("Passing Value From Excel to Password Checkbox")
	public void passing_Value_From_Excel_to_Password_Checkbox() throws IOException {

		sendText(fp11.getPassWord(), excelValueRead(
				"C:\\Users\\sathi\\eclipse-workspace\\Maven_Cucumber\\Excel\\FacebookLogin.xlsx", "Sample", 0, 1));

	}

	@When("Clicking the Login Key")
	public void clicking_the_Login_Key() {

	}

	@Then("Closing the Browser for Question{int}")
	public void closing_the_Browser_for_Question(Integer int1) {
		driver.close();
	}

}
