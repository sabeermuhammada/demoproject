package singleinheritance;

public class Sub extends AddtionTwonumbers {
	
	public void sub() {
		
		int d = a-b;
		System.out.println("Sub value is: " + d);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sub obj = new Sub();
		obj.sum();
		obj.sub();

	}

}
