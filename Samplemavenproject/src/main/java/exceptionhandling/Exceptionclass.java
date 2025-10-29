package exceptionhandling;

public class Exceptionclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 0;
		
		
		// Error occured
//		int c = a/b;
//		System.out.println("Sum is: " + c);
		
		// Exception Handling (run-time)
		try
		{
			int c = a/b;
			System.out.println("Sum is: " + c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception is: " + e);
		}
		finally
		{
			System.out.println("Exception Handing Completed");
		}
		

	}

}
