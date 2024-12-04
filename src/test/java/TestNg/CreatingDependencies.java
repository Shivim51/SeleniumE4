package TestNg;

import org.testng.annotations.Test;

public class CreatingDependencies 
{
	@Test(priority = 0)
 public void createAccount() throws InterruptedException 
 {
	 System.out.println("Create Account");
	// Thread.sleep(1000);
	 
 }
	@Test(priority = 1, dependsOnMethods = "createAccount")
  public void modifyAccount() 
  {
	  System.out.println("Modify Account");
	  
  }
	@Test(priority = 2, dependsOnMethods = "createAccount")
	public void deleteAccount() 
	{
		System.out.println("Delete Account");
		
	}
}
