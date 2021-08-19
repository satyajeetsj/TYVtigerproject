package vtigerTCAssignment;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ObjectRepo.HomePage;
import com.ObjectRepo.Loginpage;
import com.ObjectRepo.SalesOrderPage;
import com.generic.PropertyFileUtility;
import com.generic.WebDriver_Utility;

public class TC_21 {

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
		
		SalesOrderPage sop=new SalesOrderPage(driver);
		WebDriver_Utility wdu= new WebDriver_Utility();
		wdu.select_Dropdwn(sop.getFiltersdrpdwn(), 1);
		
		hp.signout(driver);
	}
		

	

}
