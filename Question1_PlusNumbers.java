package Assignment8;

import java.util.Scanner;

public class Question1_PlusNumbers {

	public static void main(String[] args) {
	
	plus();
	
	}
	public static void plus() {
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter two numbers:");
	
	int num1 = input.nextInt();
	int num2 = input.nextInt();
	
	int result = num1 + num2;
	
	System.out.println(result);
	
	
	}
}
