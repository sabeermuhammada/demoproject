package hierarchialinheritance;

public class Childtwo extends Parent {
	
	int m = 50;
	
	public void multiplication()
	{
		float mul = a*b*m;
		System.out.println("Multiplication value is: " + mul);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Childtwo ch2 = new Childtwo();
		ch2.total();
		ch2.multiplication();
		
	}

}
