package TestNg;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Grur99Assignment 
{
	@Test
	public void rightClickMe() throws InterruptedException 
	{ 
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
      driver.get("https://demo.guru99.com/test/simple_context_menu.html");
      Actions action = new Actions(driver);
      WebElement rightClickMe = driver.findElement(By.xpath("//span[text()='right click me']"));
      action.moveToElement(rightClickMe).contextClick().perform();
      List<WebElement> list=driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span"));
      for (WebElement webEle : list) 
    {
    	  webEle.click();
    	  driver.switchTo().alert().accept();
    	  Thread.sleep(2000);
    	  action.moveToElement(rightClickMe).contextClick().perform();
	}
        
      driver.close();
	}
	@Test
	public void doubleClick() throws InterruptedException 
	{
		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
	      driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	      Actions action1 = new Actions(driver);
	      WebElement doubleClickMe = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	      action1.doubleClick(doubleClickMe).perform();
	      Thread.sleep(2000);
	      driver.switchTo().alert().accept();
	      driver.close();
	}
}
