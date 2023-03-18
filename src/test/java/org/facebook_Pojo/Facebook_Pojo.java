package org.facebook_Pojo;

import org.base.classes.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_Pojo extends BaseClass {

	public Facebook_Pojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement userName;

	@FindBy(id = "pass")
	private WebElement passWord;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement logIn;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLogIn() {
		return logIn;
	}

}
