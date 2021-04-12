package day15_Method3;

public class PrimeNumber {

	public static void main(String[] args) {
	
		System.out.println(isPrime(9));
	}

	public static boolean isPrime(int number) {
		
		boolean flag = true;
		
	if(number==0 || number==1) {
		
		flag=false;
		
	}else {
	for(int i=2; i<number;i++) {

		if(number%i==0) {
			flag=false;
			break;
		}
	}
	}
	return flag;
}
}