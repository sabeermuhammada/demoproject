package exceptionhandling;

public class Nullableexception  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			String name = null;
			System.out.println("Value is:" + name.length());
		}
		catch(Exception e)
		{
			System.out.println("Exception occured");
		}
		finally
		{
			System.out.println("This is Nullable Exception Example");
		}
	}

}
