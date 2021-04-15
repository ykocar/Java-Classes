package day18_readingUserInput;

import java.util.Scanner;

public class FindTheSecretNumber {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Guess a number between 1 and 20:");
		int secretNumber = 5;
		
		do {
			
			int number = keyboard.nextInt();
			if(number>=1 && number<=20) {
				if (number==secretNumber) {
					System.out.println("Congrat, you got it");
					break;
					}else if(number<secretNumber) {
						System.out.println("Enter a bigger number");
						
					}else if(number>secretNumber) {
						System.out.println("Enter a small number");
				}
				
			}else 
				System.out.println("Invalid number");
		}while(true);
		
		/*
		 	int userInput;
		int secretNumber=8;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number:");
		
		
		do {
			
			userInput=sc.nextInt();
			
			if(userInput<secretNumber) {
				System.out.print("Enter a bigger number:");
			}else if(userInput>secretNumber) {
				System.out.print("Enter a smaller number:");
			}else {
				System.out.print("Congrat you got it...");
			}
			
		}while(userInput != secretNumber);
				
		 */
	
		}
		
		
		}

