package Assignment_10;

public class Question31_Palindrome {
	public static void main(String[] args) {
		
		String word = "noon";
		
		boolean isPalindrome = reverse(word).equalsIgnoreCase(word);
		
		System.out.println(isPalindrome);
				
	}
		public static String reverse(String str) {
			
			String result = "";

			for (int i = str.length() - 1; i >= 0; i--) { // i: represents the index numbers starting from last index to 0
				result += str.charAt(i);
			}
			
			return result;
		
		

	}

}
