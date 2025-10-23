package singleinheritance;

public class AddtionTwonumbers {
	
	int a = 10;
	int b = 20;
	
	public AddtionTwonumbers()
	{
		System.out.println("Parent class constructor");
	}
	public AddtionTwonumbers(String name)
	{
		// Call default constructor call this userd for current class constructor calling
		this();
		
		System.out.println("This is parent class parameter constructor: " + name);
	}
	public void sum()
	{
		int c = a+b;
		System.out.println("Sum is :" + c);
	}
	
 
}
