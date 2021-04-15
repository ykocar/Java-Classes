package day18_readingUserInput;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter first number:");
		
		int num1 = keyboard.nextInt();
		System.out.println("enter second number:");
		int num2 = keyboard.nextInt();
		System.out.println("enter third number:");
		int num3 = keyboard.nextInt();
		
		System.out.print("sum of three number is: " + (num1+num2+num3));
	}

}
