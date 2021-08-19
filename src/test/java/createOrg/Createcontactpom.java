package createOrg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ObjectRepo.ContactPage;
import com.ObjectRepo.CreateContactPage;
import com.ObjectRepo.HomePage;
import com.ObjectRepo.Loginpage;
import com.generic.GenerateRandomNum;
import com.generic.PropertyFileUtility;
import com.generic.WebDriver_Utility;

public class Createcontactpom {

	public static void main(String[] args) throws IOException {
		
PropertyFileUtility p=new PropertyFileUtility();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(p.readdata("URL"));
		
		GenerateRandomNum rnum=new GenerateRandomNum();
		int rno=rnum.randomnum();
		String random1 = "Jadhav"+rno;
		
		String UN=p.readdata("UN");
		String PWD=p.readdata("PWD");
		Loginpage lp=new Loginpage(driver);
		lp.loginapp(UN, PWD);
		
//		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(p.readdata("UN"));
//		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(p.readdata("PWD"));
//		driver.findElement(By.id("submitButton")).click();
		HomePage hp=new HomePage(driver);
		hp.getContactlink().click();
		
//		driver.findElement(By.xpath("//a[.='Contacts']")).click();
//		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		
		ContactPage cp=new ContactPage(driver);
		cp.getContactbutton().click();
		
		CreateContactPage ccp=new CreateContactPage(driver);
		
		WebDriver_Utility wdu=new WebDriver_Utility();
		wdu.select_Dropdwn(ccp.getFirstnamedrpdwn(), 0);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(random1);
		wdu.select_Dropdwn(ccp.getLeadsourcedrpdwn(), 4);
		
		ccp.getSavebutton().click();
		
		wdu.movetoelement(driver, hp.getSignoutLogo());
		hp.getSignout().click();
		
		
//		WebElement ele = driver.findElement(By.xpath("//input[@type='file']"));
//		ele.sendKeys("C:\\Users\\HP USER\\Desktop\\SatyaNewpicCopy.jpg");

	}

}
