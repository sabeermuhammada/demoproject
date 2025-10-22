package hierarchialinheritance;

public class Childone extends Parent {
	
	int d = 30;
	
	public void subtraction()
	{
		int sub = a-b-d;
		System.out.println("Subtraction value is: " + sub);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Childone ch1 = new Childone();
		ch1.total();
		ch1.subtraction();

	}

}
