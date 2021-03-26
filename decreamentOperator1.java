package Operators;

public class decreamentOperator1 {

	public static void main(String[] args) {
		
		int a=10;
		
		int b=--a;
	
		System.out.println(b);
		System.out.println(a);

		int a1=30;
		
		int b1=a1--;
	
		System.out.println(b1);
		System.out.println(a1);
		
		int a2=20;
		
		a2=--a2 - 1;
	
		System.out.println(a2);
		
		int a3=20;
		
		a3=a3-- - --a3;
	
		System.out.println(a3);
		
	}

}
