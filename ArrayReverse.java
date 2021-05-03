package week6;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
	
		int [] array = {10,20,30,40};
		int[] result = new int[array.length];
		
		result[0] = array[3]; // 40
		result[1] = array[2]; // 30
		result[2] = array[1]; // 20
		result[3] = array[0]; // 10
		
		System.out.println(Arrays.toString(result));
		
	}

}
