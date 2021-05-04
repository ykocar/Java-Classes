package Lab4;

public class Question12_Have1Element {

	public static void main(String[] args) {

		int[] x = {1,2,3};
		int[] y = {1,3};
		
		System.out.println(array(x,y));
	}

	public static int array(int[]arr1, int []arr2) {
		
		int count = 0;
	
		
		if(arr1[0]==1) {
			count++;
		}	
		if (arr2[0]==1) {
			count++;
		}
		
		return count;
		
}

}
