
package Basis;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.crm.BaseClass.DwsBaseClass;

import DataDrivenTesting.DwsPage;

public class ReadXmlFromDwsBase extends DwsBaseClass {
	@Parameters("url")
	@Test
	public void main(String url) 
	{
		System.out.println(url);
	}

}
