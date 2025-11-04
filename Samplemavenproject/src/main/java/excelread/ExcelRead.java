package excelread;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	static FileInputStream f;

	static XSSFWorkbook wb;

	static XSSFSheet   sh; 

	public static String getStringData(int a,int b) throws IOException  

	{

		f=new FileInputStream("E:\\Sabeer\\ExcelData\\excel_example.xlsx");

		wb= new XSSFWorkbook(f);

		sh=wb.getSheet("sheet1");

		XSSFRow r =sh.getRow(a); 

		XSSFCell c = r.getCell(b); 

		return c.getStringCellValue();

	}

	public static String getIntegerData(int a, int b) throws IOException 

	{

		f= new FileInputStream("E:\\Sabeer\\ExcelData\\excel_example.xlsx");

		wb= new XSSFWorkbook(f);

		sh=wb.getSheet("sheet1");

		XSSFRow r=sh.getRow(a);

		XSSFCell c= r.getCell(b);

		int x=(int) c.getNumericCellValue();

		return String.valueOf(x);

		

	}

	public static String getFloatData(int a, int b) throws IOException 

	{

		f= new FileInputStream("E:\\Sabeer\\ExcelData\\excel_example.xlsx");

		wb= new XSSFWorkbook(f);

		sh=wb.getSheet("sheet1");

		XSSFRow r=sh.getRow(a);

		XSSFCell c= r.getCell(b);

		float x=(float) c.getNumericCellValue();

		return String.valueOf(x);
		

	}
	
	

}
