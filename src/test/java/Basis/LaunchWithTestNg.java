package Basis;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchWithTestNg {
   @Test
	public  void main() 
	{ 
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
       driver.get("https://demowebshop.tricentis.com/");
       driver.close();
        main1();
	 }
  
      
    public static void main(String [] args) {
    	System.out.println("Hello");
    } 
    public static void main1() {
    	  System.out.println("Hello World");
    	    
    } 

}
