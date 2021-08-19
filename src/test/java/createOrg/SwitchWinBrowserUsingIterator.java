package createOrg;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchWinBrowserUsingIterator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		Thread.sleep(5000);
		Set<String> allwin = driver.getWindowHandles();
		Iterator<String> it=allwin.iterator();
		while(it.hasNext())
		{
			String wh = it.next();
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			
			System.out.println(title);
			
			if(title.equals("Tech Mahindra"))
			{
				driver.close();
			}
		}

	}

}
