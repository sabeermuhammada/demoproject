package excelread;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String a = ExcelRead.getStringData(0,0);
		System.out.println("Value is: " + a);
		
		String b = ExcelRead.getIntegerData(2, 0);
		System.out.println("Value is: " + b);

		String c = ExcelRead.getFloatData(2, 0);
		System.out.println("Value is: " + c);
		
	}

}
