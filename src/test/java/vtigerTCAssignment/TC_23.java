package vtigerTCAssignment;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ObjectRepo.HomePage;
import com.ObjectRepo.Loginpage;
import com.generic.PropertyFileUtility;

public class TC_23 {

	public static void main(String[] args) throws IOException, InterruptedException {
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
		
		driver.findElement(By.xpath("//tbody/tr/td[@id='alpha_25']")).click();
		
		hp.signout(driver);

	}

}
