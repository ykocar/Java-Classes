package day23_StringManipulation_Lab_RandomClass;

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		
	Random r=new Random(); //random class
		 
	int a=r.nextInt(10);
	
	System.out.println(a);

	int b = r.nextInt(10)+1; // from 1 to 10
	
	System.out.println(b);
	
	int c = r.nextInt(10)-5; // from -5 to 4
	
	System.out.println(c);

}

}
