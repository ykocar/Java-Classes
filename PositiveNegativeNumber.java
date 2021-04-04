package week2;

public class PositiveNegativeNumber {

	public static void main(String[] args) {
//		Task2:
//write a program that can check if number is positive negative or equals to zero.
//for example:
//		            num  = 1
//		            prints:
//		                1 is positive number
//		            num = -6
//		            print:
//		                6 is negative number
//		            num = 0
//		            print:
//		                zero

	int num=0;
	
	if (num>=1) {
		
		System.out.println(num + " is positive number");
	
	}else if(num<0) {
		
	System.out.println(num + " is negative number");
	}else
		System.out.println(num +" equals to zero");
	}

}
