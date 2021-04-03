package day_10_Loops;

public class NumberMultiplyNumber {

	public static void main(String[] args) {
		
		System.out.println("Number          NumberSquared");
		System.out.println("*****************************");
		int i;
		int numSquared; 
		for(i=1;i<=10;i++) {
			 numSquared=i*i;
			 System.out.println(" " +i+ "\t\t\t" + numSquared);
			 
			
					
				}
		
		 //OR ANOTHER CODE
		 
		 System.out.println("Number     NumberSquared");
			System.out.println("------------------------");
			
			for(int number=1;number<=10;number++) {
				
				System.out.println(number + "\t\t" + (number*number));
		}
		
		
	}

}
