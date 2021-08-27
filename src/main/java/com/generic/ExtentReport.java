package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
	
	WebDriver driver= new ChromeDriver();
	ExtentHtmlReporter reporter; // This class is used to set path and do some config
	ExtentReports reports; //Attach the reporter and set system info
	ExtentTest test; //To create the entries in the class
	
	@BeforeSuite
	public void setup()
	{
		reporter=new ExtentHtmlReporter(AutoConstants.Extentreportpath+".html");
		reporter.config().setDocumentTitle("Sdet-19");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("Smoke");
		
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		
		reports.setSystemInfo("BuildNo", "1.2");
		reports.setSystemInfo("Env", "QA");
		reports.setSystemInfo("Platform", "Windows");
	}
	
	@Test
	public void test1()
	{
		test=reports.createTest("test1");
		driver.get("https://mvnrepository.com/");
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void test2()
	{
		test=reports.createTest("test2");
		driver.get("https://facebook.com/");
		System.out.println(driver.getTitle());
	}
	
	@AfterSuite
	public void close()
	{
		reports.flush();
	}

}
