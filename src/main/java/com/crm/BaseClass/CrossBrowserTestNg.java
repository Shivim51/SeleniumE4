package com.crm.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class CrossBrowserTestNg 
{
	public static WebDriver driver;
	@Parameters("url")
    @BeforeMethod
	public static void preConditon(String browser) throws InterruptedException 
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.get("url");
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver= new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("fireFox"))
		{
			driver= new FirefoxDriver();
		}
		else {
			ChromeDriver driver = new ChromeDriver();
		}
		
	}
}
