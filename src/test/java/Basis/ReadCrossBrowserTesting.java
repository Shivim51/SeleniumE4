package Basis;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.crm.BaseClass.CrossBrowserTestNg;

public class ReadCrossBrowserTesting extends CrossBrowserTestNg
{
	@Parameters({"url"})
	@Test
  public void main(String url)
  {
	  System.out.println(url);
  }
}
