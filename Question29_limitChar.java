package Assignment_10;

public class Question29_limitChar {

	public static void main(String[] args) {
	
		limit("bla bla", 3);
	}
	public static void limit(String str,int x) {
		
		str=str.substring(0,x);
		System.out.println(str);
	}
}
