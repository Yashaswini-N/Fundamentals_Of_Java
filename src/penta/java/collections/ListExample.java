package penta.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("Sudeep");
		names.add("Preethi");
		names.add("Pranathi");
		names.add("Puneeth");
		names.add("Rina");
		names.add("chaya");
		names.add("chirayu");
		names.add("shreshta");
		names.add("Allu Arjun");
		names.add("Peter Parker");
		names.add("Harry Potter");
		names.add("Bujji");
		names.add("Agastya");
		names.add("Rina");
		names.add(" ");
		System.out.println(names);
		System.out.println(names.size());
		
		for(int i =0; i<names.size();i++)
		{
			System.out.println(names.get(i));
		}
		
		System.out.println("with enchanced for loop:");
		for(String names1 : names)
		{
			System.out.println(names1);
		}
	}

}
