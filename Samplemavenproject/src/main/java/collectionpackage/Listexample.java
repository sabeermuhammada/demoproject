package collectionpackage;

import java.util.ArrayList;
import java.util.List;

public class Listexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> listname = new ArrayList<String>();
		listname.add("Sabeer Muhammad A");
		listname.add("Age 34");
		listname.add("Obsqura Trivandrum");
		listname.add("Sabeer Muhammad A");
		System.out.println("Values of List : " + listname);
		System.out.println(listname.contains("Age 34"));
		System.out.println(listname.indexOf("Sabeer Muhammad A"));
		System.out.println(listname.lastIndexOf("Sabeer Muhammad A"));
		System.out.println(listname.get(1));
		System.out.println(listname.size());
		System.out.println(listname.isEmpty());
		listname.remove(3);
		System.out.println("Values of List : " + listname);
	}

}
