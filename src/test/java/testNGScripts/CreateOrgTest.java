package testNGScripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ObjectRepo.CreateOrgPAGE;
import com.ObjectRepo.HomePage;
import com.ObjectRepo.OrganizationPage;
import com.generic.Base_Class;
import com.generic.GenerateRandomNum;


public class CreateOrgTest extends Base_Class
{
	
	@Test(groups="Smoke test", retryAnalyzer=com.generic.RetryAnalyzer.class)
	public void CreateOrganisation(){
	
		HomePage hp=new HomePage(driver);
		hp.getOrglink().click();
		
		OrganizationPage org=new OrganizationPage(driver);
		org.getOrgbutton().click();
		
		CreateOrgPAGE crp=new CreateOrgPAGE(driver);
		
		GenerateRandomNum rnum=new GenerateRandomNum();
		int rno = rnum.randomnum();
		String random = "cluddel"+rno;
		
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(random);
		crp.getSavebutton().click();
		
		String actualorgname=driver.findElement(By.xpath("//span[@id='dtlview_Organization Name']")).getText();
		Assert.assertEquals(actualorgname, random);
		Assert.assertEquals(false, true);
		


	
	}


}
