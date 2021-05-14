package Lab4;

public class Question26_evenAndOddNumbers {

	public static void main(String[] args) {
	
		int [] x = {2,1,3,5};
		int [] y = {2,1,2,5};
		int [] z = {2,4,2,5};
		
		System.out.println(array(x));
		System.out.println(array(y));
		System.out.println(array(z));
	}
	public static boolean array (int[] arr) {
		
		for(int i =0;i<arr.length-2;i++) {
			if(arr[i]%2==0 && arr[i+1]%2==0 && arr[i+2]%2==0 ) {
				return true;
			}else if(arr[i]%2==1 && arr[i+1]%2==1 && arr[i+2]%2==1) {
				return true;
					
			}
		}
		return false;
	}

}
