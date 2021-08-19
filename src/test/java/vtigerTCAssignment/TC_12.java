package vtigerTCAssignment;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ObjectRepo.CreateSalesordPAGE;
import com.ObjectRepo.HomePage;
import com.ObjectRepo.Loginpage;
import com.ObjectRepo.SalesOrderPage;
import com.generic.PropertyFileUtility;
import com.generic.WebDriver_Utility;

public class TC_12 {

	public static void main(String[] args) throws InterruptedException, IOException {
		PropertyFileUtility p=new PropertyFileUtility();

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(p.readdata("URL"));

		Loginpage lp=new Loginpage(driver);
		lp.loginapp();

		HomePage hp=new HomePage(driver);
		hp.MoreLink(driver);
		//hp.getMorelink();
		
		SalesOrderPage sop=new SalesOrderPage(driver);
		sop.getCreatesalesbtn().click();
		
		CreateSalesordPAGE csp=new CreateSalesordPAGE(driver);
		csp.getSubjecttxtfld().sendKeys("samsungj7");
		
		csp.getOrganitxtfld().click();
		WebDriver_Utility wdu=new WebDriver_Utility();
		wdu.switchwindow(driver, "Accounts&action");
		
		csp.getOrgbrowsersearchtxt().sendKeys("samsung");
		csp.getOrgbrowserSearchbtn().click();
		Thread.sleep(2000);
		csp.getFirstRESULT().click();
		
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		a.accept();
		Thread.sleep(2000);
		wdu.switchwindow(driver,"SalesOrder&action");
		csp.getBillingtxt().sendKeys("bangalore");
		csp.getShippingtxt().sendKeys("bangalore");
		wdu.select_Dropdwn(csp.getInvoicestatusDrpdwn(), "Paid");
		wdu.select_Dropdwn(csp.getStatusdropdown(), "Created");
		csp.getAssignedGROUPradiobtn().click();
		Thread.sleep(2000);
		wdu.select_Dropdwn(csp.getAssignedTODropdwn(), "Support Group");
		Thread.sleep(2000);
		csp.getItemORproductlink().click();
		
		wdu.switchwindow(driver, "Products&action");
		driver.findElement(By.xpath("//a[.='boult earphone']")).click();
		
		wdu.switchwindow(driver, "SalesOrder&action");
		csp.getQuantitytxtfld().sendKeys("40");
		csp.getSavebtn().click();
		hp.signout(driver);

	}

}
