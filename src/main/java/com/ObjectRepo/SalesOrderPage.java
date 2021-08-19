package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesOrderPage 
{
	@FindBy(xpath="//select[@name='viewname']")
	private WebElement filtersdrpdwn;

	public WebElement getFiltersdrpdwn() {
		return filtersdrpdwn;
	}
	
	public SalesOrderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void filteraction()
	{
		getFiltersdrpdwn();
	}

	@FindBy(xpath="//input[@name='search_text']")
	private WebElement searchfield;
	
	@FindBy(xpath="(//select[@id='bas_searchfield'])[1]")
	private WebElement INdrpdwn;

	public WebElement getSearchfield() {
		return searchfield;
	}

	public WebElement getINdrpdwn() {
		return INdrpdwn;
	}
	
	@FindBy(xpath="//a[.='Export To PDF']")
	private WebElement exportpdflink;

	public WebElement getExportpdflink() {
		return exportpdflink;
	}
	
	public void exportpdf()
	{
		getExportpdflink().click();
	}
	
	@FindBy(xpath="//img[@alt='Create Sales Order...']")
	private WebElement createsalesbtn;

	public WebElement getCreatesalesbtn() {
		return createsalesbtn;
	}
	
	
	
	
}
