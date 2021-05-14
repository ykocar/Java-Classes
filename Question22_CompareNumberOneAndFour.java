package Lab4;

public class Question22_CompareNumberOneAndFour {

	public static void main(String[] args) {

		int []x = {1,4,1};
		int []y = {1,4,1,4};
		int []z = {1,1};
		
		System.out.println(array(x));
		System.out.println(array(y));
		System.out.println(array(z));
	}
	public static boolean array (int[] arr) {
		
		int count1=0;
		int count2=0;
		
		for(int each : arr) {
			if(each==1) {
				count1++;
			}
		}
		for(int each : arr) {
			if(each==4) {
				count2++;
			}
	}
		if(count1>count2) {
			return true;
		}
		return false;

}
}