package Lab4;

public class Question3_sameFirstOrLastElement {

	public static void main(String[] args) {

		int[] x = { 1, 2, 3 };
		int[] y = { 7, 3, 2 };
		
		
		//calling and print method:
		System.out.println(array(x,y));

	}
	public static String array(int[] arr1, int[] arr2) {
		if(arr1.length<=1 || arr2.length<=1) {
			return "array is not valid";
		}
		if(arr1[0]==arr2[0] || arr1[arr1.length-1]==arr2[arr2.length-1]) {
			return "true";
		}else {
			return "false";
		}
	}

	}
