package polymorphisum;

public class Methodoverridingchild extends Methodoverriding {
	
	public void display()
	{
		super.display(); // this is scenario of call parent class method name (super keyword will be using)
		System.out.println("This is child class method (Eg:- over riding)");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Methodoverridingchild obj = new Methodoverridingchild();
		obj.display();
		

	}

}
