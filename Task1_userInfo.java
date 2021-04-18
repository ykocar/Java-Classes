package week4;

import java.util.Scanner;

public class Task1_userInfo {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		
		String firstName = input.next();
		
		System.out.println("Enter your last name:");
		
		String lastName = input.next();
		
		System.out.println("Enter your age:");
		
		int age = input.nextInt();
		
		input.nextLine();
		
		System.out.println("Enter your job title:");
		
		String jobTitle = input.nextLine();
		
		
		System.out.println("first name: " +firstName);
		System.out.println("last name: " +lastName);
		System.out.println("age: " +age);
		System.out.println("job title: " +jobTitle);
	}

}
