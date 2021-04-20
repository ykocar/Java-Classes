package Lab3;

public class Question9_subString {

	public static void main(String[] args) {
		
		System.out.println(right2("Hello"));
		System.out.println(right2("java"));
		System.out.println(right2("Hi"));
	}

	public static String right2(String str) {
		if(str.length()<2) {
			return "Invalid String";
		}
		return str.substring(str.length()-2).concat(str.substring(0,str.length()-2));
	}
}
