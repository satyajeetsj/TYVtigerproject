package vtigerTCAssignment;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ObjectRepo.Loginpage;
import com.generic.PropertyFileUtility;

public class VtigetTOOLtip {

	public static void main(String[] args) throws IOException {

		PropertyFileUtility p=new PropertyFileUtility();

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(p.readdata("URL"));

		Loginpage lp=new Loginpage(driver);
		lp.loginapp();
		
		WebElement ele = driver.findElement(By.xpath("//img[@title='Open Calendar...']"));
		String tooltip = ele.getAttribute("title");
		System.out.println(tooltip);

	}

}
