package Operators;

public class increamentDecreament2 {

	public static void main(String[] args) {
	
		int a=30;
		
		int b=a-- + --a; 
		// in memory: 30 > 29> 28 
		// result: 30+28
		// a: 29> 28

		System.out.println(b);
		System.out.println(a);
	}

}
