package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.WebDriver_Utility;

public class HomePage extends WebDriver_Utility
{
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[.='Organizations']")
	private WebElement orglink;
	
	public WebElement getOrglink() {
		return orglink;
	}
	
	@FindBy(xpath="//a[.='Contacts']")
	private WebElement contactlink;
	
	public WebElement getContactlink() {
		return contactlink;
	}

	@FindBy(xpath="/html/body/table[1]/tbody/tr/td[3]/table/tbody/tr/td[2]/img")
	private WebElement signoutLogo;
	
	@FindBy(xpath="//a[.='Sign Out']")
	private WebElement signout;

	

	public WebElement getSignoutLogo() {
		return signoutLogo;
	}

	public WebElement getSignout() {
		
		return signout;
	}
	
	
	public void HomepageActivity(WebDriver driver)
	{
		
		getOrglink().click();
		//getContactlink().click();
		
		
	}
	
	
	@FindBy(xpath="//a[.='More']")
	private WebElement morelink;
	
	@FindBy(xpath="//a[@name='Sales Order']")
	private WebElement salesorderlink;

	public WebElement getMorelink() {
		return morelink;
	}

	public WebElement getSalesorderlink() {
		return salesorderlink;
	}
	
	public void signout(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
		movetoelement(driver, signoutLogo);
		getSignout().click();
	}
	
	public void MoreLink(WebDriver driver){
		movetoelement(driver, morelink);
		salesorderlink.click();
	}
	
	
}
