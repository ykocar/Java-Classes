package day23_StringManipulation_Lab_RandomClass;

public class doubleChar {

	public static void main(String[] args) {

		String str = "Fatma";
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			result = str.charAt(i) + "" + str.charAt(i) + "";
			System.out.print(result);

		}

		/*
		 String str = "Hi-there"; //TThhee substring(0,1) substring(1,2)
		 substring(2,3)
		 
		 String newString=""; //TThhee
		  
		 for(int i=0;i<str.length();i++) {
		  
		 newString = newString + str.substring(i, i+1).concat(str.substring(i, i+1));
		  
		 }
		 
		  System.out.println(newString); }
		 */

	}

}
