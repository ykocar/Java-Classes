package Lab4;

public class Question20_nextNumberTwo {

	public static void main(String[] args) {
		
		int[] x = {2,1,2};
		System.out.println(array(x));
	}
	public static boolean array (int [] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]==2 && arr[i+1]==2) {
				return true;
			}
			}
		
			return false;
		}
	}


