package day6_logicalOperators;

public class task_3_LogicalOperators {

	public static void main(String[] args) {
		
		int b = 2;
		
		boolean res = ++b == 2 || --b == 2 && --b == 2;
		
		// 3 == 2 || 2 == 2 && 1 == 2;
		// F || T && F >  F || F = F
		System.out.println(res);

	}

}
