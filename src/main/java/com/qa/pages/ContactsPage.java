package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.qa.util.TestUtil;

import com.qa.base.TestBase;

public class ContactsPage extends TestBase{
	
	@FindBy(xpath="//i[@class='users icon']")
	WebElement contacts;
	
	@FindBy(xpath="//button[contains(text(),'Create')]")
	WebElement createicon;
	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@name='last_name']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@name='middle_name']")
	WebElement middlename;
	
	@FindBy(xpath="//i[@class='save icon']")
	WebElement savebtn;
	
	public ContactsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void createContacts(String fname, String mname, String lname)
	{
		System.out.println("***********Contacts Page Starts***********");
//		Actions act=new Actions(driver);
//		act.moveToElement(contacts);
		TestUtil.MouseHover(driver, contacts);
		contacts.click();
		createicon.click();
		firstname.click();
		firstname.sendKeys(fname);
		middlename.sendKeys(mname);
		lastname.sendKeys(lname);
		savebtn.click();
}
	
	
	
}
