package multilevelinheritance;

public class Child extends Parent {
	
	public void multiplication ()
	{
		int f = a*b*d;
		System.out.println("Multiplication value is:" + f);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c = new Child();
		c.multiplication();
		c.substraction();
		c.sum();

	}

}
