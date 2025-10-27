package accessmodifierstwo;

import accessmodifiers.Accessone;

public class Accessthree extends Accessone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Accessthree obj = new Accessthree();
		obj.publicmethod();
		//obj.privatemethod();
		//obj.defaultmethod();
		obj.protectedmethod();

	}

}
