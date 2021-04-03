package day_10_Loops;

public class multiplicationTable {

	public static void main(String[] args) {
	
		
		System.out.println("Multiplication table for 7");
		System.out.println("--------------------------");

		for(int i=1;i<=10;i++) {
			
			
			int result = 7*i;
			System.out.println("7*" +i+ "="+result);
		}
	
		//OR ANOTHER CODE
		
	int num=7;
		
		System.out.println("Multiplication table for " + num);
		System.out.println("--------------------------------");
		
		
		for(int i=1;i<=10;i++) {
			
			System.out.println(num + "*" + i + "=" + (num*i));
		}
	}

}
