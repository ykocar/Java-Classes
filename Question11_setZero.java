package Lab4;

import java.util.Arrays;

public class Question11_setZero {

	public static void main(String[] args) {
	
		int []x = {1,2,3};
		int []y = {2,3,5};
		int []z = {11,2,13,3,2};
		
		System.out.println(Arrays.toString(array(x)));
		System.out.println(Arrays.toString(array(y)));
		System.out.println(Arrays.toString(array(z)));
	}
	public static int[] array (int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]==2 && arr[i+1]==3) {
				arr[i+1] = 0;
			}
		}
		return arr;
	}

}
