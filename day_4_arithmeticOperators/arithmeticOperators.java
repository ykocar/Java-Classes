package day_4_arithmeticOperators;

public class arithmeticOperators {

	public static void main(String[] args) {
	
		//Addition Operator +
		
		System.out.println(55+5);
		int chairs=140;
		System.out.println(chairs+2);
		//chairs=chairs+2;
		
		int moreChairs=chairs+5;
		System.out.println(moreChairs);
		
		int tables=130;
		int total=tables+chairs;
		System.out.println(total);
		
		//Subtraction Operator -
		
		double balance = 1200.50;
		double transaction = 56.44;
		
		System.out.println(balance-transaction);
		balance=balance-transaction;
		System.out.println(balance);
		
		//create a variable linesOfCode and assign 50 and print "Lines of code 50"
		//delete 2 lines
		//decrease the value of linesOfCode by 2 and print "LinesOfCode"
		
		int linesOfCodes = 50;
		System.out.println("Lines Of Code is:" + linesOfCodes);
		linesOfCodes=linesOfCodes-2;
		System.out.println("Lines Of Code is:" + linesOfCodes);
		
		// Multiplication *
		
		System.out.println(22*2);
		
		int classes = 5;
		System.out.println(linesOfCodes * classes);
		int totalLinesOfCodes = linesOfCodes * classes;
		System.out.println("total Lines Of Codes = " + totalLinesOfCodes);
		
		
		//Division /
		
		System.out.println(10/2);
		
		System.out.println(60/3);
		
		System.out.println(13/2);
		
		// System.out.println(11/0); // throw while running the code
		
		// Remainder %
		
		System.out.println(10%2);
		System.out.println(13%2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
