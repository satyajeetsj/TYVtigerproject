package createOrg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.generic.GenerateRandomNum;
import com.generic.JSON_FileUtility;

public class loginRandomJSON {

	public static void main(String[] args) throws IOException, ParseException {
		
		
JSON_FileUtility js=new JSON_FileUtility();
		
		WebDriver driver=new ChromeDriver();
		driver.get(js.readjson("url"));
		
		GenerateRandomNum rnum=new GenerateRandomNum();
		int ran=rnum.randomnum();
		String random="cluddel"+ran;
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(js.readjson("UN"));
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(js.readjson("PWD"));
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//td[.='Organizations']")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(random);


	}

}
