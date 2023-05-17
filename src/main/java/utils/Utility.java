package utils;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility { // resuablity purpose 

	   public static void capture(WebDriver driver, int testid, String methodName) throws IOException  {
	        // Get current system date and time
	      SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
	      Date date=new Date();
	      String dateTime=sdf.format(date);
	      
		     // Create filename for screenshot with system date/time, test ID, and method name
	      String screenshotName=dateTime+"_"+testid+"_"+methodName;
	         
	        // Take screenshot using WebDriver instance
	      TakesScreenshot ts=(TakesScreenshot)driver;
	      File source=ts.getScreenshotAs(OutputType.FILE);
	        // Save screenshot to file system
	      String dest="./test-output/ScreenShot/"+ screenshotName + ".png";
	      File destination=new File(dest);
	      ImageIO.write(ImageIO.read(source),"png",destination);
	      
	      
	   }
	   
	   
	   private static final String FILE_NAME="src/main/resources/testdata/test123.xlsx";
	   
	   public static String fetchExcelData(String sheetName ,int row , int cell) {
		   
		   String data=null;
		   FileInputStream file=null;
		   Workbook workbook =null;
		   
		   try {
			   file=new FileInputStream(FILE_NAME);
			   workbook=new XSSFWorkbook(file);
			   Sheet sheet=workbook.getSheet(sheetName);
			   Row rowObj=sheet.getRow(row);
			   Cell cellobj=rowObj.getCell(cell);
			   data =cellobj.getStringCellValue();
		   }
		   catch(IOException e) {
			   e.printStackTrace();
		   }
		   finally {
			   try {
				   if(data!=null) {
					   file.close();
				   }
				   if(workbook != null) {
					   file.close();
				   }
				   if(file !=null) {
					   file.close();
				   }
			   }
			   catch(IOException e) {
				   e.printStackTrace();
			   }
			   }
		   return data;
		   }
}
		   
			   
			   
		   
	   
	   
	   
	    
	   
	  



