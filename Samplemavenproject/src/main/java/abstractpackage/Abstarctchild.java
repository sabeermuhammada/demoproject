package abstractpackage;

public class  Abstarctchild extends Abstractparent {	

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		
		int a = 10 + 20;
		System.out.println("Value is : " + a);
		
	}
	
	public void childdisplay()
	{
		System.out.println("This is Child class abstarction");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Abstractparent obj = new Abstractparent(); // cannot be create object in parent class adbstract class
		
		Abstarctchild obj = new Abstarctchild();
		obj.dispaly();
		obj.childdisplay();
		obj.sum();
		

	}

}
