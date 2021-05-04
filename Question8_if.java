package Lab4;

public class Question8_if {

	public static void main(String[] args) {
		
		int [] x = {2,5};
		int [] y = {4,3};
		int [] z = {4,5};
		
		System.out.println(array(x));
		System.out.println(array(y));
		System.out.println(array(z));

	}
	public static boolean array(int [] arr) {
		
		for (int i=0;i<arr.length;i++) {
			
			if(arr[i]==2 || arr[i]==3) {
				return true;
			
			}
		}
	
		return false;
	
	}

	/*
	 	public static void main(String[] args) {
		
		int[] x = {2,5};
		int[] y = {4,3};
		int[] z = {4,5};
		
		System.out.println(has23(x));
		System.out.println(has23(y));
		System.out.println(has23(z));
		

	}
	
	public static boolean has23(int[] arr) {
		
		for(int value : arr) {
			
			if(value==2 || value==3) {
				
				return true;
			}
			
		}
		
		return false;
	}
	 */
}
