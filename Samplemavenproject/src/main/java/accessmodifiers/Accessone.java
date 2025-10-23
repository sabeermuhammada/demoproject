package accessmodifiers;

public class Accessone {
	
	public int a = 100; // Public
	
	private int b = 200; // Private
	
	int c = 300;        // Default
	
	protected int d = 400; // Protected
	
	public void publicmethod()
	{
		System.out.println("This is Public Method");
	}
	
	private void privatemethod()
	{
		System.out.println("This is Private Method");
	}
	
	void defaultmethod()
	{
		System.out.println("This is Default Method");
	}
	
	protected void protectedmethod()
	{
		System.out.println("This is Protected Method");
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Accessone obj = new Accessone();
//		obj.publicmethod();
//		obj.privatemethod();
//		obj.defaultmethod();
//		obj.protectedmethod();
//		
//		//publicmethod();
//
//	}

}
