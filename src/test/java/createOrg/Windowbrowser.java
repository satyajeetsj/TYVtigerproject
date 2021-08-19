package createOrg;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowbrowser {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		Thread.sleep(5000);
		Set<String> allwin = driver.getWindowHandles();
		int count = allwin.size();
		System.out.println(count);
		Thread.sleep(2000);
		int count1 = allwin.size();
		System.out.println(count1);
		for(String wh:allwin)
		{
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(2000);
			
			if(title.equals("Tech Mahindra"))
			{
				driver.close();
			}
		}



	}

}
