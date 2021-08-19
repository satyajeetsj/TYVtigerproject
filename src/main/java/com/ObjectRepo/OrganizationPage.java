package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage 
{
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement Orgbutton;
	
	public WebElement getOrgbutton() {
		return Orgbutton;
	}
	
	public OrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Orgaction()
	{
		getOrgbutton().click();
	}
	
}
