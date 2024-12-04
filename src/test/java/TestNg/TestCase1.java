package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.crm.BaseClass.DwsBaseClass;

public class TestCase1 extends DwsBaseClass
{
	@Test
  public void testScript1() throws InterruptedException
  {
	  
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions action = new Actions(driver);
		action.keyDown(Keys.PAGE_DOWN).perform();
		driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
		driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
		
		driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("Shivanim");
		driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("shivanim@gmail.com");
		driver.findElement(By.id("giftcard_2_SenderName")).sendKeys("Shivani");
		driver.findElement(By.id("giftcard_2_SenderEmail")).sendKeys("Same2@gmail.com");
		driver.findElement(By.id("giftcard_2_Message")).sendKeys("item added succesfully");
		driver.findElement(By.id("addtocart_2_EnteredQuantity")).clear();
		driver.findElement(By.id("addtocart_2_EnteredQuantity")).sendKeys("2");
		driver.findElement(By.xpath("//a[@class=\"ico-cart\"]")).click();
		String productName = driver.findElement(By.xpath("//a[@class=\"product-name\"]")).getText();
		System.out.println(productName);
		if(productName.contains("25"))
			System.out.println("product verified");
		
  }
}
