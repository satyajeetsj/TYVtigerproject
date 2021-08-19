package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPage 
{

	public CreateContactPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@name='salutationtype']")
	private WebElement firstnamedrpdwn;
	
	@FindBy(xpath="//select[@name='leadsource']")
	private WebElement leadsourcedrpdwn;
	
	@FindBy(xpath="(//input[@class='crmButton small save'])[1]")
	private WebElement savebutton;

	public WebElement getFirstnamedrpdwn() {
		return firstnamedrpdwn;
	}

	public WebElement getLeadsourcedrpdwn() {
		return leadsourcedrpdwn;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}
	

	public void createcontaction()
	{
		getFirstnamedrpdwn();
		getLeadsourcedrpdwn();
		getSavebutton().click();
	}
}
