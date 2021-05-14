package Lab4;

public class Question27_AdjacentNumbers {

	public static void main(String[] args) {

		int [] x = {1,4,5,6,2};
		int [] y = {1,2,3};
		int [] z = {1,2,4,3,6,2};
		
		System.out.println(array(x));
		System.out.println(array(y));
		System.out.println(array(z));
	}
	public static boolean array (int [] arr) {
		
		for(int i=0;i<arr.length-2;i++) {
			
			if(arr[i+1]==arr[i]+1 && arr[i+2]==arr[i]+2 ) {
				return true;
			}
			
		}
		return false;
	}

}
