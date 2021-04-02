package day_10_Loops;

public class sumOfEvenAndOddNumbers {

	public static void main(String[] args) {
	
		int i = 1;
		int odd_sum= 0 ;
		int even_sum = 0;
		
		for(i=1;i<100;i++) {
			if(i%2==0) {
				even_sum+=i;
		
			}
			else {
				odd_sum+=i;
			
			}
		}
		System.out.println(even_sum);
		System.out.println(odd_sum);
		
	}

}
