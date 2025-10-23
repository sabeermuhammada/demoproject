package singleinheritance;

public class Sub extends AddtionTwonumbers {
	
	int a = 40;
	
	public Sub()
	{
		// Super constructor call
		super("SABEER MUHAMMAD A");
		System.out.println("This is Child class Constructor");
	}
	
	
	public void sub() {
		
		int d = a-b;
		System.out.println("Sub value is: " + d);
		
		// Current class variable call
		System.out.println("Value of A is: " + super.a);
		
		// Super class variable call
		System.out.println("Value of A is: " + super.a);
		
		// Super Method call
		//super.sum();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sub obj = new Sub();
		
		//obj.sum();
		
		//obj.sub();

	}

}
