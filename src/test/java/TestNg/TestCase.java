package TestNg;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.BaseClass.Assigment1;
import com.crm.BaseClass.DwsBaseClass;

public class TestCase extends DwsBaseClass {
	String expected_url = "https://demowebshop.tricentis.com/news/rss/1";
	@Test
	public void testScript1() throws InterruptedException{
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
		for ( WebElement web : links) 
		{
			web.click();
			String actual_url=driver.getCurrentUrl();
			if(actual_url.equals(expected_url)) 
			{
			  driver.navigate().back();
			}
			Thread.sleep(3000);
		}
		System.out.println("TestScript1 Executed");
	}
	@Test
	public void testScript2() throws InterruptedException
	{
		driver.findElement(By.id("small-searchterms")).sendKeys("Books");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		System.out.println("Test Script2 Executed");
	}

}
