package Lab4;

import java.util.Arrays;

public class Question9_newDoubleArray {

	public static void main(String[] args) {
		
		int [] x = {4,5,6};
		int [] y= {7,5,4,3};
		System.out.println(Arrays.toString(array(x)));
		System.out.println(Arrays.toString(array(y)));
	}
	public static int [] array (int [] arr1) {
		
		int [] arr2 = new int [2*arr1.length];
		for(int i= 0;i<arr2.length;i++) {
			arr2[arr2.length-1] = arr1[arr1.length-1];
		}
			
		return arr2;
	}
	
	
}
