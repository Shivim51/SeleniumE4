package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcelUsingLoop 
{
	public static void main(String[] args) throws EncryptedDocumentException,IOException
	{
		 FileInputStream fis =new FileInputStream("C:\\Users\\Lenovo i5 2nd\\Desktop\\Selenium\\Selenium.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		 Sheet sheet = wb.getSheet("Sheet1");
		 int row= sheet.getPhysicalNumberOfRows();
		 int cell = sheet.getRow(0).getPhysicalNumberOfCells();
		 System.out.println("Row"+ row + "Cell"+ cell);
		 for(int i=0;i<2;i++) {
			 for(int j=0;j<2;j++)
			 {
				String data = sheet.getRow(i).getCell(j).toString();
				 System.out.println(data);
			 }
		 }
	}
}
