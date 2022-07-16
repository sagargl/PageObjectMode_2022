package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//div[contains(text(),'Contacts activity stream')]")
	WebElement cont_stream;;
	
	@FindBy(xpath="//div[contains(text(),'Deals')]")
	WebElement deals;
	
	@FindBy(xpath = "//span[contains(text(),'Call')]")
	WebElement callqueue;
	
	
	
	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifyContactsStreamLabel(){
		return cont_stream.isDisplayed();
	}
	
	public boolean verifyDealsLabel(){
		return deals.isDisplayed();
	}
	
	public boolean verifyCallQueueLabel(){
		return callqueue.isDisplayed();
	}
	
	
	
	
		}
	
	
	

