package Assignment8;

import java.util.Scanner;

public class Question5_PostiveNegativeZero {

	public static void main(String[] args) {
		
		sign();
		
	}
	
	public static void sign() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int num = input.nextInt();
		
		if (num>0) {
			System.out.println("1");
		}else if(num<0) {
			System.out.println("-1");
		}else {
			System.out.println("0");
		}
		
		
	}
	
	

}
