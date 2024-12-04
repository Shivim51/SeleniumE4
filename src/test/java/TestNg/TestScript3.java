package TestNg;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.crm.BaseClass.DwsBaseClass;

public class TestScript3 extends DwsBaseClass
{
	@Test
  public void testScript3() throws InterruptedException
  {
	WebElement digitaldown = driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]"));
	Actions action = new Actions(driver);
	action.keyDown(Keys.CONTROL).click(digitaldown).perform();
	 String mainWindow = driver.getWindowHandle();
	  Set<String> mainWindow2 = driver.getWindowHandles();
	
	 for (String windowHandles : mainWindow2) 
	 {
		 if(!mainWindow.equals(mainWindow2)) {
			 driver.switchTo().window(windowHandles);
			
		 }
	}
	 List<WebElement> gifts = driver.findElements(By.xpath("//input[@value='Add to cart']"));
	 for (WebElement product : gifts) 
	{
		product.click();
	
	Thread.sleep(2000);
   }
  } 
}
