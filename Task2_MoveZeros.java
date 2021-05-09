package week7;

import java.util.Arrays;

public class Task2_MoveZeros {

	public static void main(String[] args) {

		
	int[] array = {1,0,2,0,3,0,0,4,5,6,7};

	 int count = 0;

	    for (int i = 0; i < array.length; i++) {
	        if (array[i] != 0) {
	            array[count++] = array[i];
	        }
	    }
	    
	    while (count < array.length) {
	        array[count++] = 0;
	    
	}
	    
	    System.out.println(Arrays.toString(array));
	}
}

/*
 * move all zeros to the end of array
 * 
 * array = {1,0,2,0,3,0,0,4,5,6,7}
 * 
 * output: {1,2,3,4,5,6,7,0,0,0,0}
 * 
 * DO NOT USE sort
 */
