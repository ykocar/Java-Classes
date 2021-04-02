package day_10_Loops;

public class sumOf1To100 {

	public static void main(String[] args) {
		
		int sum =0;
		for(int i=1;i<=100;i++) {
			sum=sum+i;
			System.out.println(i+" ");
			System.out.print(sum+ " ");
		}
System.out.println(sum);
	}

}
