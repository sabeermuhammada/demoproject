package multipleinheritance;

public class InterfaceClass implements Interfacetwo,Interfacethree {

	@Override
	public void examplathree() {
		// TODO Auto-generated method stub
		
		System.out.println("This is Multiple Inheritance Example one");
		
	}

	@Override
	public void examplattwo() {
		// TODO Auto-generated method stub
		System.out.println("This is Multiple Inheritance Example two");
		
	}
	
	public static void main(String[] args) {
		
		InterfaceClass obj = new InterfaceClass();
		obj.examplathree();
		obj.examplattwo();
		
		
	}
	
	
	
	

}
