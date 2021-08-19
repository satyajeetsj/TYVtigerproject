package webtable;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.generic.PropertyFileUtility;

public class CreateOrg_checkbox {

	public static void main(String[] args) throws IOException {
		PropertyFileUtility p=new PropertyFileUtility();

		WebDriver driver=new ChromeDriver();
		driver.get(p.readdata("URL"));


		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(p.readdata("UN"));
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(p.readdata("PWD"));
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//td[.='Organizations']")).click();
		List<WebElement> chkbox = driver.findElements(By.xpath("//table/tbody/tr/td/input[@type='checkbox']"));
		for(int i=1;i<chkbox.size();i++)
		{
			chkbox.get(i).click();
		}


	}

}
