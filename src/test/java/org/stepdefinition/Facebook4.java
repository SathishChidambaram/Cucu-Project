package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.classes.BaseClass;
import org.facebook_Pojo.Facebook_Pojo;

import cucumber.api.java.en.When;

public class Facebook4 extends BaseClass {

	Facebook_Pojo fp4;

	@When("launch")
	public void launch() {

		launchURL("https://www.facebook.com/");

	}

	@When("Pass Value in userName OneDimensionalMap")
	public void pass_Value_in_userName_OneDimensionalMap(io.cucumber.datatable.DataTable dm1) {

		fp4 = new Facebook_Pojo();
		Map<String, String> asMap = dm1.asMap(String.class, String.class);
		sendText(fp4.getUserName(), asMap.get("username"));
	}

	@When("Pass Value in passWord TwoDimensionalMaps")
	public void pass_Value_in_passWord_TwoDimensionalMap(io.cucumber.datatable.DataTable dm2) {
		List<Map<String, String>> asMaps = dm2.asMaps();
		sendText(fp4.getPassWord(), asMaps.get(1).get("passWord1"));
		
		driver.close();

	}

}
