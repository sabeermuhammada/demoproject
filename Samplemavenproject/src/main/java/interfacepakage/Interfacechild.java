package interfacepakage;

public class Interfacechild implements Interfaceparent {

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		
		int a = 10 + 20;
		System.out.println("Value is : " + a);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interfaceparent obj1 = new Interfacechild(); // parent class + obj name  = new keyword + child class name this way intereface object creation.
		obj1.sum();
		
//		Interfacechild obj = new Interfacechild();
//		obj.sum();
	}
	

}
