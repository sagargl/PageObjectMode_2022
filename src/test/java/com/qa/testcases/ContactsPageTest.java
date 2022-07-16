package com.qa.testcases;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.ContactsPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestUtil;

public class ContactsPageTest extends TestBase{
	LoginPage loginpage;
	TestUtil util;
	HomePage homepage;
	ContactsPage contactspage;
	
	public ContactsPageTest()
	{
		super();
	}
	
 
  @BeforeTest
	public void setUp() throws InterruptedException {
		
		initialization();
		util = new TestUtil();
		loginpage = new LoginPage();
		homepage = new HomePage();
		contactspage=new ContactsPage();
		loginpage.login(prop.getProperty("uname"), prop.getProperty("pwd"));
		System.out.println("Login successfully");
	}
  
  
  @DataProvider
	public Object[][] getCRMTestData() throws InvalidFormatException{
		Object data[][] = TestUtil.getTestData("contacts");
		return data;
	}
	
	
	
	
	@Test(priority=2, dataProvider="getCRMTestData")
	public void validateCreateNewContact(String firstName, String middlename, String lastname){
		//  contactsPage.clickOnNewContactLink();
		//contactsPage.createNewContact("Mr.", "Tom", "Peter", "Google");
		contactspage.createContacts(firstName, middlename, lastname);
		
	}
	
  
//  @Test(priority=1)
//	public void verifyContactsPageTest()
//	{
//	  contactspage.createContacts("Fuser3", "Muser3", "Luser3");
//	}
}
