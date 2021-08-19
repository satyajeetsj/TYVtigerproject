package createOrg;

import java.util.concurrent.TimeUnit;

import org.dom4j.DocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.generic.XML_FileUtility;

public class Login_XML extends XML_FileUtility {

	public static void main(String[] args) throws DocumentException {
		XML_FileUtility rxml=new XML_FileUtility();
		
		WebDriver driver=new ChromeDriver();
		driver.get(rxml.readXML("//commondata/URL"));
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(rxml.readXML("//commondata/UN"));
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(rxml.readXML("//commondata/PWD"));
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//td[.='Organizations']")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("cluddel5687");

	}

}
