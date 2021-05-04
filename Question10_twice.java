package Lab4;

public class Question10_twice {

	public static void main(String[] args) {

		int[] x = { 2, 2 };
		int[] y = { 3, 3 };
		int[] a = { 2, 3 };
		int[] b = { 12, 20, 42 };
		int[] c = { 2, 2, 2 };
		System.out.println(array(x));
		System.out.println(array(y));
		System.out.println(array(a));
		System.out.println(array(b));
		System.out.println(array(c));
	}

	public static boolean array(int [] arr) {
		
		int count1 = 0;
		int count2 = 0;
		for (int i=0;i<arr.length;i++) {
			
			if(arr[i]==2) {
				count1++;
			}else if (arr[i]==3) {
				count2++;
			 
		}
			
			}
		if(count1==2 || count2==2) {
			return true;
		
		}else {
			return false;

}
	}
}