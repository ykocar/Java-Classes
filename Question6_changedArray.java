package Lab4;

import java.util.Arrays;

public class Question6_changedArray {

	public static void main(String[] args) {

		int[] x = { 1, 20, 3 };

		System.out.println(Arrays.toString(changeArray(x)));
	}

	public static int [] changeArray(int[] arr) {

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=max;

	}
		return arr;

}
}