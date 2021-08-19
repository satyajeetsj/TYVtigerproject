package createOrg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ObjectRepo.CreateOrgPAGE;
import com.ObjectRepo.HomePage;
import com.ObjectRepo.Loginpage;
import com.ObjectRepo.OrganizationPage;
import com.generic.GenerateRandomNum;
import com.generic.PropertyFileUtility;
import com.generic.WebDriver_Utility;

public class loginRandomProp {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		PropertyFileUtility p=new PropertyFileUtility();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(p.readdata("URL"));
		
		GenerateRandomNum rnum=new GenerateRandomNum();
		int rno = rnum.randomnum();
		String random = "cluddel"+rno;
		
		String UN=p.readdata("UN");
		String PWD=p.readdata("PWD");
		
		Loginpage lp=new Loginpage(driver);
		lp.loginapp(UN, PWD);
		
		
		
//	
//		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(p.readdata("UN"));
//		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(p.readdata("PWD"));
//		driver.findElement(By.id("submitButton")).click();
		
		HomePage hp=new HomePage(driver);
		hp.getOrglink().click();
		
//		driver.findElement(By.xpath("//td[.='Organizations']")).click();
//		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		
		OrganizationPage org=new OrganizationPage(driver);
		org.getOrgbutton().click();
		
		CreateOrgPAGE crp=new CreateOrgPAGE(driver);
		
		
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(random);
		
		WebDriver_Utility wdu=new WebDriver_Utility();
		wdu.select_Dropdwn(crp.getIndustryDrpdwn(), 2);
		wdu.select_Dropdwn(crp.getTypeDrpdwn(), 2);
		
		crp.getSavebutton().click();
		Thread.sleep(2000);
		
		//hp.getSignoutLogo().click();
		hp.signout(driver);


	}

}
