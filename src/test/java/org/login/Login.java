package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClassss;

public class Login extends BaseClassss {
	
	public Login() {
	PageFactory.initElements(driver,this);
	}
	//with page factory
	@FindBy(id="email")
    private WebElement txtUsername;
	@FindBy(id="pass")
	private WebElement txtPassword;
	@FindBy(name="login")
	private WebElement btnLogin;
	public WebElement getTxtUsername() {
		return txtUsername;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	
}
