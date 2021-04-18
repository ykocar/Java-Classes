package week4;

import java.util.Scanner;

public class ScannerPractice2 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter employee ID:");
		
		int id = input.nextInt();
		
		input.nextLine();// Enter
		
		System.out.println("Enter your full name");
		
		String name = input.nextLine();
		
		System.out.println("ID: " +id);
		System.out.println("name: " +name);

	}

}
