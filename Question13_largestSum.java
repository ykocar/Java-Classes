package Lab4;

import java.util.Arrays;

public class Question13_largestSum {

	public static void main(String[] args) {

		int [] x = {6,2};
		int [] y = {5,3};
		array(x,y);
	}
	public static void array(int[] arr1,int[] arr2) {
		
		int sum1=0;
		int sum2=0;
		
		for(int value : arr1) {
			sum1+=value;
		}
		for(int value : arr2) {
			sum2+=value;
		}
		if(sum1>sum2) {
			System.out.println(Arrays.toString(arr1));
		} else if(sum2>sum1) {
			System.out.println(Arrays.toString(arr2));
		}else {
			System.out.println("equal");
		}
	}

}
