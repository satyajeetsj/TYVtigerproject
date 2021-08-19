package vtigerTCAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonPriceMobile {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("mobile under 15000");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//span[.='Redmi']")).click();
		driver.findElement(By.xpath("//span[.='Featured']")).click();
//		WebDriver_Utility wdu=new WebDriver_Utility();
//		wdu.select_Dropdwn(ele, "Price: High to Low");
		driver.findElement(By.xpath("//a[.='Price: High to Low']")).click();
		WebElement price = driver.findElement(By.xpath("//span[@class='celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//span[@class='a-price-whole']"));
		String text = price.getText();
		System.out.println(text);
		
		StringBuffer str=new StringBuffer(text);
		str.deleteCharAt(text.length()-4);
		System.out.println(str);
		
		String priceint=new String(str);
		
		int PRICE = Integer.parseInt(priceint);
		if(PRICE<15000)
		{
			System.out.println("Test case Pass");
		}
		else
		{
			System.out.println("Test case Fail");
		}
		
		
		
		

	}

}
