package Basis;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipletTestAnnotation 
{
	@Test(priority = 1)
   public void rcb() 
   {
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
      driver.get("https://www.royalchallengers.com/");
      driver.close();
   }
	@Test(priority = -1, invocationCount = 2 , threadPoolSize = 2)
	   public void csk() 
	   {
		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
	      driver.get("https://www.chennaisuperkings.com/");
	      driver.close();
	   }
	@Test(priority = 0)
	   public void mumbai() 
	   {
		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
	      driver.get("https://www.mumbaiindians.com/players");
	      driver.close();
	   }
}
