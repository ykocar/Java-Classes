package Lab4;

import java.util.Arrays;

public class Question1_arrayTrue {

	public static void main(String[] args) {

		int[] x = { 1, 2, 6 };
		int[] y = { 6, 1, 2, 3 };
		int[] z = { 13, 6, 1, 2, 3 };
		
		//calling and print method:
		System.out.println(array(x));
		System.out.println(array(y));
		System.out.println(array(z));
		
	}

	public static boolean array(int[] d) {
		if (d.length < 1) {
			return false;
		}
		if (d[0] == 6 || d[d.length - 1] == 6) {
			return true;
		} else {
			return false;
		}
		
	}
	
}
