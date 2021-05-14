package Lab4;

public class Question24_everyWhere {

	public static void main(String[] args) {
		
		int [] x= {1,2,3};
		int a = 2;
		System.out.println(array(x,a));
		
		int [] y = {1,2,1,3};
		int b = 1;
		System.out.println(array(y,b));
	}

	public static boolean array(int[] arr, int x) {

		for (int i=0;i<arr.length-2;i++) {

			if (arr[i] == x && ((arr[i+1]) == x || (arr[i+2]) == x)) {
				return true;
			}
			
		}
		
		return false;
	}

}
