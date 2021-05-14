package Lab4;

import java.util.Arrays;

public class Question23_ANewArray {

	public static void main(String[] args) {
	
		System.out.println(Arrays.toString(array(4)));
	}
	public static int[] array (int x) {
		
		int [] arr = new int[x];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i;
		
	}
		return arr;
		
}
}