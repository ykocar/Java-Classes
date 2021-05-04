package week6;

import java.util.Arrays;

public class Task1_mergeElements {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 6, 7 };

		int[] arr3 = new int[arr1.length + arr2.length];

		
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		
		for(int i=0, j=arr1.length; j<(arr3.length); 
                j++, i++) {
			arr3[j] = arr2[i];
			
}
		System.out.println(Arrays.toString(arr3));
	}
		

	}

/*
 * 1. write a program that can merge two arrays of integer and retuns the third
 * array arr1 ={1,2,3} arr2 = {4,5,6,7}
 * 
 * output: arr3 = {1,2,3,4,5,6,7}
 */
