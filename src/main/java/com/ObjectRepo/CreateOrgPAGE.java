package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrgPAGE 
{
	 public CreateOrgPAGE(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//select[@name='industry']")
	private WebElement industryDrpdwn;
	
	@FindBy(xpath="//select[@name='accounttype']")
	private WebElement typeDrpdwn;
	
	@FindBy(xpath="//img[@title='Select']")
	private WebElement plusbutton;
	
	@FindBy(xpath="(//input[@class='crmbutton small save'])[1]")
	private WebElement savebutton;

	

	public WebElement getIndustryDrpdwn() {
		return industryDrpdwn;
	}

	public WebElement getTypeDrpdwn() {
		return typeDrpdwn;
	}

	public WebElement getPlusbutton() {
		return plusbutton;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}
	
	public void createorgAction()
	{
		
		getIndustryDrpdwn().click();
		getTypeDrpdwn().click();
		getPlusbutton().click();
		getSavebutton().click();
	}
	
	
}
