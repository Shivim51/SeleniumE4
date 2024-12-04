package com.crm.BaseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.google.common.annotations.VisibleForTesting;

public class DwsBaseClass {
	public static WebDriver driver=null;
	@Parameters("url")
	@BeforeClass
	public void preCondition(String url) {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");	
	}
	@BeforeMethod
	public void login() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.id("Email")).sendKeys("shivin123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("sk@1234");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
	}
	@AfterMethod
	public void logout() {
		 driver.findElement(By.xpath("//a[text()='Log out']")).click();
	   }
	
	@AfterClass
	public void postCondition() {
		driver.quit();
	}

}
