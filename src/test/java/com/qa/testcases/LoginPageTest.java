package com.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;
import com.qa.util.TestUtil;

public class LoginPageTest extends TestBase{
	LoginPage loginpage;
	TestUtil util;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod() 
	public void setUP()
	{ 
		initialization();
		util=new TestUtil();
		loginpage=new LoginPage();
	}
	
	@Test(priority=1)
	public void loginTest()
	{
		loginpage.login(prop.getProperty("uname"), prop.getProperty("pwd"));
		
	}
	
}
