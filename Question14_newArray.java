package Lab4;

import java.util.Arrays;

public class Question14_newArray {

	public static void main(String[] args) {
		
		int[] x = { 4, 4 };
		int[] y = { 2, 2 };

		System.out.println(Arrays.toString((array(x,y))));

	}
	public static int [] array (int [] arr1,int[]arr2) {
	
	int[] arr3 = new int[arr1.length + arr2.length];

	
	for (int i = 0; i < arr1.length; i++) {
		arr3[i] = arr1[i];
	}
	
	for(int i=0, j=arr1.length; j<(arr3.length); 
            j++, i++) {
		arr3[j] = arr2[i];
		
}
	return arr3;
}

}
