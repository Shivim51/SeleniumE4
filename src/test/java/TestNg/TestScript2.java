package TestNg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.crm.BaseClass.DwsBaseClass;

public class TestScript2 extends DwsBaseClass
{ 
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	String expected_rssUrl = "https://demowebshop.tricentis.com/news/rss/1";
	String expected_fbUrl = "https://www.facebook.com/nopCommerce";
	@Test
	public void testScript2() throws InterruptedException {
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Actions action = new Actions(driver);
	action.keyDown(Keys.PAGE_DOWN).perform();
	action.keyDown(Keys.PAGE_DOWN).perform();
	List<WebElement> links = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
	for ( WebElement web : links) 
	{
		web.click();
		Thread.sleep(3000);
		String actual_fbUrl=driver.getCurrentUrl();
	     if(actual_fbUrl.equals(expected_fbUrl)) {
	    	 driver.findElement(By.xpath("//span[text()='Create new account']")).click();	    
	    }
	    String actual_rssUrl=driver.getCurrentUrl();
		if(actual_rssUrl.equals(expected_rssUrl)) 
		{
		  driver.navigate().back();
		}
		Thread.sleep(3000);
	}
	System.out.println("TestScript1 Executed");
	
	
  }
}
