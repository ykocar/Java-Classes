package day8_controlFlowStatements_part2;

public class largestNumber {

	public static void main(String[] args) {
	int num1 = 90,num2 = 8,num3 = 7;
		
		if(num1> num2 && num1 >num3) {
			
		System.out.println("the greatest number is: " + num1);
		
		}else if(num2> num1 && num2 >num3) {
			
		System.out.println("the greatest number is: " + num2);
		
		} else if(num3> num1 && num3 >num2) {
			
		System.out.println("the greatest number is: " + num3);
		
		}else
			System.out.println("numbers are equal");

	}

}
