package week4;

import java.util.Scanner;

public class Task2_addressInfo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your full name:");
		
		String fullName = input.nextLine();
		
		System.out.println("Enter your address:");
		
		String address = input.nextLine();
		
		System.out.println("Enter your city name:");
		
		String cityName = input.nextLine();
				
		System.out.println("Enter your state:");
		
		String state = input.nextLine();
		
		System.out.println("Enter your zipcode:");
		
		String zipCode = input.next();
		
		System.out.println("Enter your age:");
		
		int age = input.nextInt();
		
		
		System.out.println("full name: " +fullName);
		System.out.println("address: " +address);
		System.out.println("city name: " +cityName);
		System.out.println("state: " +state);
		System.out.println("zipcode: " +zipCode);
		System.out.println("age: " +age);
	}

}
