package Lab4;

public class Q3 {

	public static void main(String[] args) {
		
		int [] [] a = {{1,2}, {7,3}};
		
		System.out.println(check2arrays(a));
	}

		public static String check2arrays(int[][] arr) {

			String x= "";
	        if (arr[0].length > 1 || arr[1].length > 1) {
	        	 if (arr[0][0] == arr[1][0] || arr[0][arr[0].length - 1] == arr[1][arr[1].length - 1]) {
		                x+= "true";
	        	 }
	        
	        }else {
	             if (arr[0].length < 1) {
	             x+="array1 is not valid";
	             }

	             if (arr[1].length < 1) {

	            x+="array2 is not valid";
	        }
	}
	        return x;
	      
	

		}
	}
