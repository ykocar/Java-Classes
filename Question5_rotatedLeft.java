package Lab4;

import java.util.Arrays;

public class Question5_rotatedLeft {

	public static void main(String[] args) {  
	  
		int [] x = {1,2,3};
		
		System.out.println(Arrays.toString(roratedLeft(x)));
	 }

	public static int[] roratedLeft(int [] arr) {
	
		int x = arr[0];
		for(int i =0; i<arr.length-1;i++) {
			arr[i] = arr[i+1];
			
		}
		
		arr[arr.length-1] =x;
		
			return arr;
	

}
}