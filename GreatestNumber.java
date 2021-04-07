package day13_Methods;

public class GreatestNumber {

	public static void main(String[] args) {
		
		greatestNumber(10,20,30);
		greatestNumber(50,30,20);
		greatestNumber(50,60,10);
	}
	public static void greatestNumber(int num1, int num2, int num3) {
		 
		boolean num1Greatest = num1>num2 && num1>num3;
		boolean num2Greatest = num2>num1 && num2>num3;
		if(num1Greatest) {
			System.out.println(num1 + " is greatest number");
		}else if (num2Greatest) {
			System.out.println(num2 + " is greatest number");
		}else
			System.out.println(num3 + " is greatest number");
		}
		
		
	}

