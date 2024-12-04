package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrimeNum {
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException  
	{	
		 FileInputStream fis =new FileInputStream("C:\\Users\\Lenovo i5 2nd\\Desktop\\Selenium\\Selenium.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		 Sheet sheet = wb.getSheet("Sheet2");
		 int row= sheet.getPhysicalNumberOfRows();
		 int cell = sheet.getRow(0).getPhysicalNumberOfCells();
		 System.out.println("Row-"+ row +" " + "Cell-"+ cell);
		 boolean flag =true;
		 for(int i=0;i<row;i++)
		 {
			 for(int j=0;j<cell;j++)
			 {
				 double data = sheet.getRow(i).getCell(j).getNumericCellValue();
	              // System.out.println("Checking if " + data + " is prime.");
				System.out.println(data);
				if(isPrime(data))
				{
					System.out.println("prime num"+ data);
					
				}
				else {
					System.out.println("false");
				}
			 }
	    }
	}
	
		   public static boolean isPrime(double data) {
		        
			   
		        if (data < 2 || data % 1 != 0) 
		        	return false;

		        int number = (int) data;
		        for (int i = 2; i <= Math.sqrt(number); i++) {
		            if (number % i == 0) {
		                return false;
		            }
		        }
		        return true;
	
		
	}
} 
