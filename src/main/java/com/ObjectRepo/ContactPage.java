package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage 
{
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement contactbutton;
	
	public ContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getContactbutton() {
		return contactbutton;
	}

	public void contactaction()
	{
		getContactbutton().click();
	}
}
