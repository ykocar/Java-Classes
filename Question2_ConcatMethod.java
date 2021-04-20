package Lab3;

public class Question2_ConcatMethod {

	public static void main(String[] args) {
	
		System.out.println(bye("Hi", "Bye"));
		System.out.println(bye("Yo", "Alice"));
		System.out.println(bye("What", "Up"));
	}
	
	
	public static String bye(String a, String b) {
		
		return a.concat(b).concat(b).concat(a);
				
		
	}

}
