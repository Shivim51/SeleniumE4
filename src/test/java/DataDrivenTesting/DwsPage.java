package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DwsPage  {

	public static void main(String[] args) throws EncryptedDocumentException,IOException, InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String expected_result = "https://demowebshop.tricentis.com/";
		
		driver.get("https://demowebshop.tricentis.com/");
		String actual_result = driver.getCurrentUrl();
		if(expected_result.equals(actual_result))
		{
			System.out.println("I am in dws page");
			driver.findElement(By.xpath("//a[@class='ico-login']")).click();
			 FileInputStream fis =new FileInputStream("C:\\Users\\Lenovo i5 2nd\\Desktop\\Selenium\\Selenium.xlsx");
			 Workbook wb = WorkbookFactory.create(fis);
			 Sheet sheet = wb.getSheet("Sheet1");
			 String email1 = sheet.getRow(0).getCell(0).toString();
			 String psw1= sheet.getRow(1).getCell(0).toString();
			 String value = sheet.getRow(0).getCell(1).toString();
			 Thread.sleep(2000);
			 driver.findElement(By.id("Email")).sendKeys(email1);
			 Thread.sleep(2000);
			 driver.findElement(By.id("Password")).sendKeys(psw1);
			 Thread.sleep(2000);
			 Thread.sleep(2000);
			driver.findElement(By.id("RememberMe")).click();
			driver.findElement(By.cssSelector("input[value='Log in']")).click();
			 driver.findElement(By.id("small-searchterms")).sendKeys(value);
		}
		else 
		{
			System.out.println("I am not in dws page");
		}

	}

}
