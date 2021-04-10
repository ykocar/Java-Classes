package week3;

import java.util.Iterator;

public class BranchingStatements {
	
	public static void main(String[] args) {
		
	
	
	for(int i = 1; i <= 10; i++) {
		System.out.println(i);
		if(i == 5) {
			break;  // exits the current loop
		}
	}
	
	System.out.println("---------------------------------------------");
	
	for(int j = 10; j <= 100; j+= 10) {
		if( j == 50 || j == 70) {
			continue;  // 
		}
		
		System.out.println(j);
	}
	
	System.out.println("-------------------------------------------");
	
	for(int m = 1; m <= 21; m++) {
		if(m%3 ==0) {
			continue; // skips
		}
		
		System.out.print(m +" "); //1 2 4 5 7 ...
	}
	
	System.out.println("\n-------------------------------------------");
	
	for(int k = 1; k <= 18; k++) {
		if(k %2 != 0 ) {
			continue;
		}
		
		if(k > 12) {
			//return;  // exits the current method
			break; //exits the current loop
		}
		System.out.print(k+" ");
		
	}
	
	
	System.out.println("\nHello EU 5");
	}

}
