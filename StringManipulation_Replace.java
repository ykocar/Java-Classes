package day20_StringManipulation_Part2;

public class StringManipulation_Replace {

	public static void main(String[] args) {
	
		String str = "Moscow is a capital of Russia of Russia";
		
		str = str.replace("Russia", "Azerbaijan").replace("Moscow", "Baku");
		
		System.out.println(str);
		System.out.println("*************************");
		
		String email = "firstName_lastName@gmail.com";
		
		String company = "capitalone";
		
		String newEmail = email.replace("gmail", company);
		
		System.out.println(newEmail);
		
		
	}

}
