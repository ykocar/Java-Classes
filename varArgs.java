package day30_CommandLineArguments_VarArgs_WrapperClasses;

import java.util.Iterator;

public class varArgs {

	public static void main(String[] args) {
	
		sum(2,4);
		sum(2,4,4,6);
	}
	
	public static void sum(int...numbers) {
		
		int sum =0;
		
		for (int value: numbers) {
			sum = sum + value;
		}
		System.out.println(sum);
	}
	
}
