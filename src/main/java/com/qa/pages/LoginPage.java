package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {

	//PageFactory-OR:
	@FindBy(name="email")
	@CacheLookup
	WebElement email;
	
	@FindBy(css ="div > input[type=password]")
	WebElement password;
	
	@FindBy(xpath="//a[contains(text(),'Forgot your password')]")
	WebElement forgotpassword;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginbtn;
	
	//Initiliaze the page objects
	public LoginPage() {

		//PageFactory.initElements(driver, LoginPage.class);
		PageFactory.initElements(driver, this);
		
	}
	
	 //Action class
	
		public String validateLoginPageTitle()
		{
			return driver.getTitle();
		}
		
		public boolean validateForgotPassword()
		{
			return forgotpassword.isDisplayed();
		}
		
		public void login(String un, String pw)
		{
			email.sendKeys(un);
			password.click();
			password.sendKeys(pw);
			loginbtn.click();
		}
		
	}



