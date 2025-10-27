package encapulation;

public class Encapulationparent {
	
	private String name;
	private int age;
	
	public void setdata(String name, int age)
	{
		this.name = name;
		this.age = age;		
	}
	
	public void getdata()
	{
		// age = age*2;
		System.out.println("Name is :" + name);
		System.out.println("Age is : " + age);
	}

}
