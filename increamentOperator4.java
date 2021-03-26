package Operators;

public class increamentOperator4 {

	public static void main(String[] args) {
		
		int a=20;
		
		a=++a + ++a;
		// in memory: 20>21>22
		// result:21 + 22
		System.out.println(a);
		
		int b=20;
		b=b++ + b++;
		// in memory: 20>20>21
		// result:20 + 21
		
		
		System.out.println(b);
		
		int c=20;
		int d=c++ + ++c;
		// in memory: 20>22
		// result:20 + 22

		System.out.println(c);
		System.out.println(d);
		
	}

}
