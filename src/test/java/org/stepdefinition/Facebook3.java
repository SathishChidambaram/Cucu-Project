package org.stepdefinition;

import java.util.List;

import org.base.classes.BaseClass;
import org.facebook_Pojo.Facebook_Pojo;

import cucumber.api.java.en.When;

public class Facebook3 extends BaseClass {

	Facebook_Pojo fp3;

	@When("Launching URL")
	public void launching_URL() {
		launchURL("https://www.facebook.com/");
	}

	@When("Passing value in userName OneDimensionalList")
	public void passing_value_in_userName_OneDimensionalList(io.cucumber.datatable.DataTable dt1) {

		fp3 = new Facebook_Pojo();
		List<String> alist = dt1.asList();
		sendText(fp3.getUserName(), alist.get(0));

	}

	@When("Passing value in passWordTwoDimensionalList")
	public void passing_value_in_passWordTwoDimensionalList(io.cucumber.datatable.DataTable dt2) {

		List<List<String>> alists = dt2.asLists();
		sendText(fp3.getPassWord(), alists.get(1).get(0));

	}

	@When("Close the Browser")
	public void close_the_Browser() {

		close();
	}

}
