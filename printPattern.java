package day13_Methods;

public class printPattern {

	public static void main(String[] args) {
		
		printPattern(1);

	}

	public static void printPattern(int i) {
		for(i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		
	}
}
