package day_10_Loops;

public class evenNumbers {

	public static void main(String[] args) {
		
	for(int even=2;even<=100;even=even+2) {
		System.out.print(even+" ");
	}
	System.out.println("\n");
	System.out.println("*************************");
	
	for(int i=1;i<=100;i++) {
		if(i%2==0) {
			System.out.print(i + " ");
		}
		
	}

	}

}
