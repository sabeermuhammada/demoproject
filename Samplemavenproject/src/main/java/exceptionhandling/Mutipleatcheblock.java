package exceptionhandling;

import java.io.IOException;

public class Mutipleatcheblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 0;
		
		
		try
		{
//			String n = null;			
			int c = a/b;
			System.out.println("Sum is: " + c);
//			System.out.println("Sum is: " + n.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception is: " + e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception is: " + e);
		}
		catch(Exception e)
		{
			System.out.println("Exception is: " + e);
		}
		finally
		{
			System.out.println("Exception Handing Completed");
		}

	}

}
