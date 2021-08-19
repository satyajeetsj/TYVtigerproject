package testNGScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ObjectRepo.HomePage;
import com.ObjectRepo.SalesOrderPage;
import com.generic.Base_Class;
import com.generic.WebDriver_Utility;

public class TC_21Testng extends Base_Class{
	@Test(groups="Regression test")
	public void createSalesOrder() throws IOException
	{

		//PropertyFileUtility p=new PropertyFileUtility();
		
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get(p.readdata("URL"));
		
//		Loginpage lp=new Loginpage(driver);
//		lp.loginapp();
		
		HomePage hp=new HomePage(driver);
		hp.MoreLink(driver);
		//hp.getMorelink();
		
		SalesOrderPage sop=new SalesOrderPage(driver);
		WebDriver_Utility wdu= new WebDriver_Utility();
		wdu.select_Dropdwn(sop.getFiltersdrpdwn(), 1);
		
//		hp.signout(driver);

	}
}
