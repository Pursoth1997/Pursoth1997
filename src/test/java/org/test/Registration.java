package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClassss;

public class Registration extends BaseClassss {
	
public Registration() {
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="(//a[@role='botton'])[2]")
private WebElement btnCreate;

@FindBy(name="firstname")
private WebElement txtFirstname;

@FindBy(name="lastname")
private WebElement txtLastname;

@FindBy(name="reg_email")
private WebElement txtMobile;

@FindBy(name="websubmit")
private WebElement btnsignup;

public WebElement getBtnCreate() {
	return btnCreate;
}

public WebElement getTxtFirstname() {
	return txtFirstname;
}

public WebElement getTxtLastname() {
	return txtLastname;
}

public WebElement getTxtMobile() {
	return txtMobile;
}

public WebElement getBtnsignup() {
	return btnsignup;
}








}
