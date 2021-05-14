package Lab4;

public class Question21_sumOfNumberTwosEight {

	public static void main(String[] args) {
	
		int[] x = {2,3,2,2,4,2};
		int[] y = {2,3,2,2,4,2,2};
		int[] z = {1,2,3,4};
		
		System.out.println(array(x));
		System.out.println(array(y));
		System.out.println(array(z));
	}
	public static boolean array (int[] arr) {
		int sum =0; 
		for(int each :arr) {
			if(each==2) {
				sum+=each;
			}
		}
			if(sum==8) {
				return true;
				
			}
			return false;
		}

}
