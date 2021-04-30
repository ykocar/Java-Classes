package Assignment_10;

public class Question28_badWord {

	public static void main(String[] args) {
	
		badWord("he said bla bla bla", "bla");
	}
	public static String badWord(String text,String badWord) {
		
		if(text.contains(badWord)) {
			text = text.replace(badWord, "");
		}
		System.out.println(text);
		
		return text;
	}

}
