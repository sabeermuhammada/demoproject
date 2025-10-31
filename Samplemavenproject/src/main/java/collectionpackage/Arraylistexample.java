package collectionpackage;

import java.util.ArrayList;
import java.util.List;

public class Arraylistexample {

	public static void main(String[] args) {
		
		ArrayList<String> arraylistname = new ArrayList<String>();
		arraylistname.add("Hyzam Amir");
		arraylistname.add("Age 3");
		arraylistname.add("Naufin Nivas");
		arraylistname.add("Kazhakkuttam");
		System.out.println("Values of List : " + arraylistname);
		
		ArrayList<String> newarraylist = new ArrayList<String>();
		newarraylist.add("Nishi N");
		newarraylist.add("Age 32");
		newarraylist.add("Naufin Nivas");
		newarraylist.add("Kazhakkuttam");
		System.out.println("Values of List : " + newarraylist);

		arraylistname.addAll(newarraylist);
		System.out.println("Values of List : " + arraylistname);
		
		System.out.println(arraylistname.containsAll(newarraylist));
		
	}

}
