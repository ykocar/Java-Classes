package Assignment3;

public class VendingMachine {

	public static void main(String[] args) {
	
		
		int priceOfItem = 95;
		
		// 1 dolar = 100 cents
		
		int change = 100- priceOfItem;
		
		int numberOfQuarters = change/25;
		
		change = change%25;
		
		int numberOfDimes = change/10;
		
		change = change%10;
		
		int numberOfNickles =change/5;
		
		System.out.println("Price in cents : " + priceOfItem);
		System.out.println("Your change is " + numberOfQuarters + " quarters " + 
			 numberOfDimes + " dimes, and " + numberOfNickles + " nickles.");
		
		
		/*
		 Write a program that determines the change to be dispensed from a vending machine. 
		 An item in the machine can cost between 25 cents and 1 dollar, 
		 in 5-cent increments (25, 30, 35, . . . , 90, 95, or 100), 
		 and the machine accepts only a single dollar bill to pay for the item.

      Sample output

      Price in cents : 95

      Your change is 0 quarters, 0 dimes, and 1 nickles
		 */

	}

}
