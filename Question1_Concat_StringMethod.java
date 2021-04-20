package Lab3;

public class Question1_Concat_StringMethod {

	public static void main(String[] args) {
	
		System.out.println(hello("Bob!"));
		System.out.println(hello("Alice!"));
	}

	public static String hello(String name1) {

		return "Hello ".concat(name1);
	}
}