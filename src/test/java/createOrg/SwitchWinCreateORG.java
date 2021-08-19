package createOrg;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.generic.GenerateRandomNum;
import com.generic.PropertyFileUtility;

public class SwitchWinCreateORG {

	public static void main(String[] args) throws IOException {
		
PropertyFileUtility p=new PropertyFileUtility();
		
		WebDriver driver=new ChromeDriver();
		driver.get(p.readdata("URL"));
		
		GenerateRandomNum rnum=new GenerateRandomNum();
		int rno = rnum.randomnum();
		String random = "cluddel"+rno;
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(p.readdata("UN"));
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(p.readdata("PWD"));
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//td[.='Organizations']")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(random);
		driver.findElement(By.xpath("//img[@title='Select']")).click();
		
		
		
		Set<String> allwin = driver.getWindowHandles();
		for(String wh:allwin)
		{
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			System.out.println(title);
			
			if(title.contains("Accounts&action"))
			{
				break;
			}
			
		}
		driver.findElement(By.xpath("//a[.='cluddel2']")).click();
		
		Alert a = driver.switchTo().alert();
		a.accept();
		

	}

}
