package Friday;

import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args) {
	
	int number=0;
	int max=0;
	int min=0;
	
		
		//Enter a whole number from 1-99, and I will find a 
		//	combination of coins that equals that amount  of change
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount of change:");
		int attempt = 0;
		
			
			do {
				int userAmount = input.nextInt();
				
				if(userAmount>=1 && userAmount<=99) {
					changeMaker(userAmount);
					break;
				}else {
					for(int i=1;i<=5;i++) {
						System.out.println("Enter a number: ");
						number = input.nextInt();
						
						if(number>max) {
							max=number;
						}
						if(number<min) {
							min=number;
						}
						}
					attempt++;
					if(attempt==3) {
							System.out.println("Sorry no more attempt");
							break;
					}else {
							System.out.println("Try again!");
						}
					}
				
			}while(true);
	}
		
			public static void changeMaker(int amount) {
			
			
			
			int originalAmount=amount;
			
			int quarters = amount/25;
			
			amount = amount%25;
			
			int dimes = amount/10;
			
			amount = amount%10;
			
			int nickles = amount/5;
			
			amount = amount%5;
			
			int pennies = amount;
			
			System.out.println(originalAmount + " cents in coins can be given as: ");
			System.out.println(quarters + " quarters");
			System.out.println(dimes + " dimes");
			System.out.println(nickles + " nickles");
			System.out.println(pennies + " pennies");


	}

}
