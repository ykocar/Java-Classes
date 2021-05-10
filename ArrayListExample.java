package day31_ArrayList;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		// Languages
		
		ArrayList<String> language = new ArrayList<>();
		
		language.add("Turkish");
		language.add("English");
		language.add("French");
		language.add("Arabic");
		
		System.out.println(language.toString());
		
		// Print size arrayList
		
		System.out.println(language.size());
		
		// read couple of elements
		
		System.out.println(language.get(0));
		System.out.println(language.get(1));
		System.out.println(language.get(2));
		System.out.println(language.get(3));
		
		
		
		
	}
}

		