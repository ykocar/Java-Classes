package week4;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int max = -2147483648;
		int min = 2147483647;
		for(int i=1;i<=5;i++) {
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		
		if(number>max) {
			max=number;
		}
		if(number<min) {
			min=number;
		}
		}
		System.out.println("maximum number is: "+max);
		System.out.println("minimum number is: "+min);
	
	}

}
