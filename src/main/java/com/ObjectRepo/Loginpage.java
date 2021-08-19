package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	WebDriver driver;
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement usernametxtfld;
	
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement passwordtxtfld;
	
	@FindBy(id="submitButton")
	private WebElement submitbtn;
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsernametxtfld() {
		return usernametxtfld;
	}

	public WebElement getPasswordtxtfld() {
		return passwordtxtfld;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}
	
	
	public void loginapp()
	{
		getUsernametxtfld().sendKeys("admin");
		getPasswordtxtfld().sendKeys("admin");
		getSubmitbtn().click();
	}
	
	public void loginapp(String username, String password)
	{
		getUsernametxtfld().sendKeys(username);
		getPasswordtxtfld().sendKeys(password);
		getSubmitbtn().click();
	}
}
