package Lab4;

import java.util.Arrays;

public class Question2_ArrayLength {

	public static void main(String[] args) {
		
		int[] x = { 1, 2, 3 };
		int[] y = { 1, 2, 3, 1 };
		int[] z = { 1, 2, 1 };
		int[] k = {1}; 
		
		//calling and print method:
		System.out.println(array(x));
		System.out.println(array(y));
		System.out.println(array(z));
		System.out.println(array(k));
	}
	public static String array(int[] arr) {
		if(arr.length<=1) {
			return "not a valid array";
		}
		if(arr[0]==arr[arr.length-1]) {
			return "true";
		}else {
			return "false";
		}
	}

}
