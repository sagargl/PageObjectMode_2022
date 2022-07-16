package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestUtil;



public class HomePageTest extends TestBase{
	LoginPage loginpage;
	TestUtil util;
	HomePage homepage;
	
	public HomePageTest()
	{
		super();
	}
	
 
  @BeforeTest
	public void setUp() throws InterruptedException {
		
		initialization();
		util = new TestUtil();
		loginpage = new LoginPage();
		homepage = new HomePage();
		loginpage.login(prop.getProperty("uname"), prop.getProperty("pwd"));
		System.out.println("Login successfully");
	}
  
  @Test(priority=1)
	public void verifyContactsStreamLabelTest()
	{
	  Assert.assertTrue(homepage.verifyContactsStreamLabel(), "Contacts activity stream");

	}
  
  public void verifyDealsLabelTest()
	{
	  Assert.assertTrue(homepage.verifyDealsLabel(), "Deals");

	}
  
  public void verifyCallQueueLabelTest()
  {
	  Assert.assertTrue(homepage.verifyDealsLabel(), "Call Queue");

}
}
