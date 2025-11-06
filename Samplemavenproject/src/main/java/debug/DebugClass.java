package debug;

public class DebugClass {
	
	public void display()
	{
		for(int i = 0; i<=10;i++)
		{
			System.out.println("Value i is: " +i);
		}
	}

	public static void main(String[] args) {
		
		DebugClass obj = new DebugClass();
		obj.display();				

	}

}
