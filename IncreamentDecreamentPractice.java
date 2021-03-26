package Operators;

public class IncreamentDecreamentPractice {

	public static void main(String[] args) {
		
		int x = 4;
		int y = x * 4 - x++;
		// 16 - 4=12; x= 5
		System.out.println("y= " + y);
		System.out.println("x= " +x);
		
		int a1=20;
		a1=a1-- + ++a1;
		System.out.println(a1);
		
		int a=1;
		   
	    System.out.println(a++);//1
	    System.out.println(a++);//2
	    System.out.println(++a);//4
	 
	    System.out.println(a++);//4
	    System.out.println(a++);//5
	 
	    System.out.println(a--);//6
	    System.out.println(a--);//5
	 
	    System.out.println(--a);//3
	    System.out.println(--a);//2
	    System.out.println(a--);//2
		    
		   
		 

	}

}
