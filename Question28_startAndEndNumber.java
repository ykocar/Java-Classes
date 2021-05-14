package Lab4;

import java.util.Arrays;

public class Question28_startAndEndNumber {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 10;
		
		System.out.println(Arrays.toString(array(x,y)));
	}
	public static int[] array (int x, int y) {
		
		int [] arr = new int[y-x];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=x;
			arr[arr.length-1]=y-1;
			x++;
		
			}
		return arr;

	}
		
}
