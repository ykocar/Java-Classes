package Operators;

public class uniaryOperator {

	public static void main(String[] args) {
	
		int x = 2;
		int y = x++;
		
		
		System.out.println(y); // y= 2
		System.out.println(x); // x= 3
		
		
		int x1 = 2;
		int y1 = ++x1;
		
		System.out.println(y1); // y= 3
		System.out.println(x1); // x= 3
	
		int x3 = 2;
		System.out.println(x3++);

		int x4 = 2;
		System.out.println(--x4);
		
		int x5 = 8;
		int y2 = x5--;
		System.out.println(y2);
		System.out.println(x5);
		
		int a = 50;
		
		int res= --a + a++ + a-- + a++; // 49+49+50+49
		System.out.println(res);
		System.out.println(a);
		
		
		
		
		
	}

}
