package exceptionhandling;

public class Exceptionclasstwo {
	
	public void display()
	{
		System.out.println("This is the Throw & Throws Exception Handling Example program");
	}

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		int age = 15;
		
		Exceptionclasstwo obj = new Exceptionclasstwo();
		obj.display();
		
		if(age>18)
		{
			System.out.println("Eglible For Voteing");
		}
		else
		{
			// Throw exception handling
			//throw new ArithmeticException("Eglible For Not - Voteing"); 
			
			// Throws exception handling :-	in main method declare the throws Exception		
			throw new Exception("Eglible For Not - Voteing");
			
		}

	}

}
