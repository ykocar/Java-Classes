package Lab3;

public class Question5_subString_Length {

	public static void main(String[] args) {
		
	System.out.println(firstHalf("WooHoo"));
		
	}
	
	public static String firstHalf(String str) {
		
		int x = str.length()/2;
		return str.substring(0, str.length()/2);
	}
		
}
