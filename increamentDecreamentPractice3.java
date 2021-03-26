package Operators;

public class increamentDecreamentPractice3 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 3;
		int c = a * b++; //5*3  
		int d = a * ++b; //5*5
		
		System.out.println(c);
		System.out.println(d);
		
		double x = 7.77; 
		int y; 
		y = (int)++x;
		
		System.out.println(x);
		
		int x1 = 99;
		int y1 = 10;

		y1 = x1++ ;

		System.out.println("x1: " + x1 + "  y1: " + y1 );
		
	}

}
