package day21_StringManipulation_StringMethods;

public class String_SubString {

	public static void main(String[] args) {
	
		String sentence = "Java String Manipulation is fun!";
		
		System.out.println(sentence.substring(2));
		System.out.println(sentence.substring(5, 11));
		System.out.println(sentence.substring(5, sentence.length()-5));
		
		String chars = "{{}}";
		String word = "AUTOMATION";
		
		String text = chars.substring(0, 2)+word+ chars.substring(2);
		System.out.println(text);
		System.out.println(chars.length());
	}

}
