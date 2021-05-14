package Lab4;

public class Question17_DifferenceBetweenLargestAndSmallest {

	public static void main(String[] args) {

		int[] x= {10,3,5,6};
		int[] y= {7,2,10,9};
		int[] z= {2,10,7,2};
		
		System.out.println(array(x));
		System.out.println(array(y));
		System.out.println(array(z));
	}

	public static int array(int[] arr) {

		int max = arr[0];
		for (int i = 0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		int min = arr[0];
		for (int j = 0; j<arr.length; j++) {
			if(arr[j]<min) {
				min=arr[j];
				}
		}
		
		return max-min;
		
	}
}
	
	
	