package Assignment8;

import java.util.Scanner;

public class Question2_cubedOfNumber {

	public static void main(String[] args) {

		cube();
	}
	public static void cube() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		int num = input.nextInt();
		
		int result = num*num*num;
		
		System.out.println(result);
		
	}
	

}
