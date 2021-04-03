package day_10_Loops;

public class loppsLargestNumber {

	public static void main(String[] args) {

		int num1= 1;
		int num2 =1;
		
		for(int i=1;i<=3;i++) {
		if(num1>num2) {
			System.out.println(num1+ " is the larger");
		}else if (num2>num1){
			System.out.println(num2 + " is the larger");
		}else {
			System.out.println(num1 + " is equal to " +num2);
		}
		
		}
	}

}
