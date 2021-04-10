package week3;

public class While_VS_DoWhileLoop {

public static void main(String[] args) {
		
		int n = 10;
		
		do {
			System.out.println("Do While Loop");
		}while(n < 9);
		
		System.out.println("------------------------");
		
		while(n < 9) {
			System.out.println("While Loop");
		}
}
}