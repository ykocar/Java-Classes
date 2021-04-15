package day19_stringManipulation;

import java.util.Scanner;

public class FirstAndLastName {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your firstname and lastname:");
		
		String nameAndSurname= input.nextLine();
		
		System.out.println("Total character in your name and surname is:" + nameAndSurname.length());

	}

	/*public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Enter your first name:");  
		String firstName = sc.next();
		
		System.out.print("Enter your last name:");
		String lastName = sc.next();
		
		System.out.println("Total characters in your first and last name is:" +((firstName.length())+lastName.length()) );
*/
}