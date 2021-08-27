package com.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.ObjectRepo.HomePage;
import com.ObjectRepo.Loginpage;

public class Base_Class implements AutoConstants{
	public WebDriver driver;
	public WebDriver_Utility wdu=new WebDriver_Utility();
	PropertyFileUtility p=new PropertyFileUtility();
	public static WebDriver staticdriver;

	//@Parameters("BROWSER")
	@BeforeClass(groups={"Smoke test","Regression test"})
	public void launchbrowser() throws IOException, InterruptedException
	{
		//String BROWSER=System.getProperty("browser");
		String BROWSER=p.readdata("BROWSER");
		if(BROWSER.equals("chrome"))
		{
			Thread.sleep(2000);
			driver=new ChromeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		//String URL=System.getProperty("url");// to give url at run time in maven command line we use this
		//driver.get(URL);//to give url at run time in maven command line we use this
		driver.get(p.readdata("URL"));
	
	}

	@BeforeMethod(groups={"Smoke test","Regression test"})
	public void logintoVtiger() throws IOException
	{
		String UN=p.readdata("UN");
		String PWD=p.readdata("PWD");

		Loginpage lp=new Loginpage(driver);
		lp.loginapp(UN, PWD);
		staticdriver=driver;
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

//	public static String screenshot(String name)
//	{
//		TakesScreenshot tss=(TakesScreenshot) driver;
//		File src=tss.getScreenshotAs(OutputType.FILE);
//		File dst=new File("../VTIGER_prac/Screenshots");
//		FileUtils.copyFile(src, dst);
//	}
//	
	public static String getscreenshot(String name) throws IOException
	{
		File srcfile=((TakesScreenshot)staticdriver).getScreenshotAs(OutputType.FILE);
		String destfile=System.getProperty("user.dir")+"/Screenshots/"+name+".png";
		File finaldest=new File(destfile);
		FileUtils.copyFile(srcfile, finaldest);
		
		return destfile;
	}
}
