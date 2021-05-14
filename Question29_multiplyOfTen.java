package Lab4;

import java.util.Arrays;

public class Question29_multiplyOfTen {

	public static void main(String[] args) {

		int[] x = { 2, 10, 3, 3, 20, 4 };
		System.out.println(Arrays.toString(array(x)));
	}
	public static int[] array(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i]%10 == 0) {
				for (int j = i + 1; j < arr.length && arr[j] % 10 != 0; j++) {
					arr[j] = arr[i];
				}
			}
		}
		return arr;
	}
}
