package Loops;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		boolean b=false;
		int i=1;
		
		do {
			i++;
			System.out.println(b);
		}while(b=!b);
		System.out.println(b);
		System.out.println(i);
	}
}
