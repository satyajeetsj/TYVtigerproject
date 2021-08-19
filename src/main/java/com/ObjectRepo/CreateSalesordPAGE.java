package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateSalesordPAGE 
{
	
	
	public CreateSalesordPAGE(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='subject']")
	private WebElement subjecttxtfld;
	
	@FindBy(xpath="(//img[@alt='Select'])[4]")
	private WebElement organitxtfld;
	
	@FindBy(xpath="//textarea[@name='bill_street']")
	private WebElement billingtxt;
	
	@FindBy(xpath="//textarea[@name='ship_street']")
	private WebElement shippingtxt;
	
	@FindBy(xpath="//select[@name='invoicestatus']")
	private WebElement InvoicestatusDrpdwn;
	
	@FindBy(xpath="//img[@id='searchIcon1']")
	private WebElement ItemORproductlink;
	
	@FindBy(xpath="//input[@id='qty1']")
	private WebElement quantitytxtfld;
	
	@FindBy(xpath="(//input[@class='crmbutton small save'])[1]")
	private WebElement savebtn;
	
	

	public WebElement getSubjecttxtfld() {
		return subjecttxtfld;
	}

	public WebElement getOrganitxtfld() {
		return organitxtfld;
	}

	public WebElement getBillingtxt() {
		return billingtxt;
	}

	public WebElement getShippingtxt() {
		return shippingtxt;
	}

	public WebElement getInvoicestatusDrpdwn() {
		return InvoicestatusDrpdwn;
	}

	public WebElement getItemORproductlink() {
		return ItemORproductlink;
	}

	public WebElement getQuantitytxtfld() {
		return quantitytxtfld;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}
	
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement orgbrowsersearchtxt;
	
	@FindBy(xpath="//input[@type='button']")
	private WebElement orgbrowserSearchbtn;
	
	@FindBy(xpath="(//tbody/tr)[10]/td[1]/a")
	private WebElement firstRESULT;



	public WebElement getOrgbrowsersearchtxt() {
		return orgbrowsersearchtxt;
	}

	public WebElement getOrgbrowserSearchbtn() {
		return orgbrowserSearchbtn;
	}

	public WebElement getFirstRESULT() {
		return firstRESULT;
	}
	
	@FindBy(xpath="//select[@name='sostatus']")
	private WebElement Statusdropdown;
	
	@FindBy(xpath="//input[@ value='U']")
	private WebElement AssignedUSERRadiobtn;
	
	@FindBy(xpath="//select[@name='assigned_user_id']")
	private WebElement AssignedTODropdwn;

	@FindBy(xpath="//input[@ value='T']")
	private WebElement AssignedGROUPradiobtn;
	
	
	

	public WebElement getAssignedGROUPradiobtn() {
		return AssignedGROUPradiobtn;
	}

	public WebElement getStatusdropdown() {
		return Statusdropdown;
	}

	public WebElement getAssignedUSERRadiobtn() {
		return AssignedUSERRadiobtn;
	}

	public WebElement getAssignedTODropdwn() {
		return AssignedTODropdwn;
	}
	
	

}
