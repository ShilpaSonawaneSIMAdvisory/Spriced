package org.pageobjects;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	public LoginPage() {
		
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//input[@class='submit']")
	private WebElement loginBtn;
	
	//@FindBys({
		
	//	@FindBy(name="login"),
	//	@FindBy(xpath="//button[text()='Log In']"),
	//	@FindBy(id="u_0_d_Wj")		
//	})
//	private WebElement allBtn;
	
/*	@FindAll({
		
		@FindBy(name="login"),
		@FindBy(xpath="//button[text()='Log In']"),
		@FindBy(id="u_0_d_Wj")		
	})
	private WebElement loginButton; */

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	

	/*public WebElement getAllBtn() {
		return allBtn;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}*/

	
	
	
	

}



