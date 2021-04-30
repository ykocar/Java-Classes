package Assignment_10;

public class Question26_uniqueChars {

	public static void main(String[] args) {
		
		uniqueChars("java");
	}
		public static void uniqueChars(String word) {

	        String uniques = "";

	        for (int i = 0; i < word.length(); i++) {

	            String myChar = "" + word.charAt(i);

	            if (! uniques.contains(myChar)) {
	                uniques += myChar;
	            }
	        }
	        System.out.println(uniques);
	    }
}