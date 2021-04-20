package Lab3;

public class Question3_subStringMethod {

	/*
	 Create a method return a new string made of 3 copies of the last 2 chars 
	 of the original string. The string length will be at least 2.
	 extraEnd("Hello") -- "lololo"
	 */
	
	
	public static void main(String[] args) {
	
		hello("Hello");
		
	}

	public static void hello(String str) {
		
		for(int i=1;i<=3;i++) {
		System.out.print(str.substring(str.length()-2));
		
		}
	/*
	 public static void main(String[] args) {
		
		System.out.println(extraEnd("Hello"));
		System.out.println(extraEnd("I am java"));
		System.out.println(extraEnd("a"));
		

	}
	
	public static String extraEnd(String str) {
		
		if(str.length()<2) {
			return "Invalid String";
		}
		
		String dummy = "";
	
		dummy = str.substring(str.length()-2);
		
		return dummy+dummy+dummy;	
	 */
		
	}
		
	}
