package Lab4;

public class Question16_evenNumbers {

	public static void main(String[] args) {

		int [] x= {2,1,2,3,4};
		int [] y= {2,2,0};
		int [] z= {1,3,5};
		
		System.out.println(array(x));
		System.out.println(array(y));
		System.out.println(array(z));
	}
	public static int array(int[] arr) {
		
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2==0) {
				count++;
			}
		}
		return count;
	}

}
