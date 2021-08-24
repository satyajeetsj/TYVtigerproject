package com.generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.ObjectRepo.HomePage;
import com.ObjectRepo.Loginpage;

public class Base_Class {
	public WebDriver driver;
	PropertyFileUtility p=new PropertyFileUtility();

	//@Parameters("BROWSER")
	@BeforeClass(groups={"Smoke test","Regression test"})
	public void launchbrowser() throws IOException
	{
		String BROWSER=System.getProperty("browser");
		//String Browser=p.readdata("browser");
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		String URL=System.getProperty("url");// to give url at run time in maven command line we use this
		driver.get(URL);//to give url at run time in maven command line we use this
		//driver.get(p.readdata("URL"));

	}

	@BeforeMethod(groups={"Smoke test","Regression test"})
	public void logintoVtiger() throws IOException
	{
		String UN=p.readdata("UN");
		String PWD=p.readdata("PWD");

		Loginpage lp=new Loginpage(driver);
		lp.loginapp(UN, PWD);
	}

	@AfterMethod(groups={"Smoke test","Regression test"})
	public void logoutVtiger() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		Thread.sleep(2000);
		hp.signout(driver);
	}

	@AfterClass(groups={"Smoke test","Regression test"})
	public void closebrowser()
	{
		driver.close();
	}

}
