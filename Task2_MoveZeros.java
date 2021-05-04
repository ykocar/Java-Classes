package week6;

import java.util.Arrays;

public class Task2_MoveZeros {

	public static void main(String[] args) {

		
	int[] array = {1,0,2,0,3,0,0,4,5,6,7};

	 int count = 0;

	    for (int j = 0; j < array.length; j++) {
	        if (array[j] != 0) {
	            array[count++] = array[j];
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
