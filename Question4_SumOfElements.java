package Lab4;

public class Question4_SumOfElements {

	public static void main(String[] args) {
		
		int [] x = {1,2,3};
		int [] y = {5,11,2};
		int [] z = {7,0,0};
		int [] a = {3,-2,10,4};
		
		System.out.println(sumOfArray(x));
		System.out.println(sumOfArray(y));
		System.out.println(sumOfArray(z));
		System.out.println(sumOfArray(a));
		
	}
	public static int sumOfArray(int [] arr) {
		
		int sum = 0;
		
		for(int i = 0; i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}

}
