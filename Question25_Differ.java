package Lab4;

public class Question25_Differ {

	public static void main(String[] args) {

//		int [] x = {1,2,3};
//		int [] y = {2,3,5};
		
		int [] arr1 = new int [3];
		
		int [] arr2 = {1,2,3};
		
		int a = 3;
		int b = 4;
		
		System.out.println(sum(a,b));
		System.out.println(sum(5,6));
		
		
		System.out.println(array(new int[] { 1, 2, 3 }, new int[] { 2, 3, 5 }));
		
//		System.out.println(array(x,y));
	}

	public static int array(int[] arr1, int[] arr2) {

		int count = 0;
		for (int i = 0; i < arr1.length; i++) {

//			if ((arr1[i] - arr2[i] <= 2 && arr1[i] - arr2[i] > 0)
//					|| (arr2[i] - arr1[i] <= 2 && arr2[i] - arr1[i] > 0)) {
			
			if(Math.abs(arr1[i] - arr2[i])<=2 && Math.abs(arr1[i] - arr2[i]) > 0) {
				
				count++;
				
			}

		}
		return count;

	}
	public static int sum (int n1, int n2) {
		
		return n1+n2;
		
	}
}
