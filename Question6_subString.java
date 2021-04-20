package Lab3;

public class Question6_subString {

	public static void main(String[] args) {
	
		System.out.println(withoutEnd("Hello"));
		System.out.println(withoutEnd("java"));
		System.out.println(withoutEnd("coding"));
		System.out.println(withoutEnd("e"));
		
	}

	public static String withoutEnd(String str) {
		
		if(str.length()<2) {
			return "Invalid String";
		}
		return str.substring(1,str.length()-1);
	}
}
