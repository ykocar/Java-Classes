package day_4_arithmeticOperators;

public class discount {

	public static void main(String[] args) {
		
		//this Program calculates the sale price of an 
		//item is regularly priced at $59, with a 20% discount on it
		
		int regularPrice=59;
		double discount;
		double salesPrice;
		
		discount=regularPrice*0.2;
		salesPrice=regularPrice-discount;
		
		System.out.println("Regular Price: $" + regularPrice);
		System.out.println("Discount amount: $" + discount);
		System.out.println("Sale Price: $" + salesPrice);
		
		

	}

}
