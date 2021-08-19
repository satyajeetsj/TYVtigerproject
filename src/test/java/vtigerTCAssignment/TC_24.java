package vtigerTCAssignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ObjectRepo.HomePage;
import com.ObjectRepo.Loginpage;
import com.ObjectRepo.SalesOrderPage;
import com.generic.PropertyFileUtility;

public class TC_24 {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		
		PropertyFileUtility p=new PropertyFileUtility();

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(p.readdata("URL"));

		Loginpage lp=new Loginpage(driver);
		lp.loginapp();

		HomePage hp=new HomePage(driver);
		hp.MoreLink(driver);
		
		driver.findElement(By.xpath("//a[@title='Sales Order']")).click();
		
		SalesOrderPage sop=new SalesOrderPage(driver);
		sop.exportpdf();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		hp.signout(driver);

	}

}
