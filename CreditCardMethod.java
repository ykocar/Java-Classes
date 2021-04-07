package day13_Methods;

public class CreditCardMethod {

	public static void main(String[] args) {

		double salary = 50_000;
		int creditRating = 7;
		
		if(salary>=20_000 && creditRating>=7) {
			qualify();
		}else {
			nonQualify();
		}
		
	}
		public static void nonQualify() {
		System.out.println("I am sorry, you are not qualified for the CC");
	}
		public static void qualify() {
		System.out.println("Congrat, you are qualified for the CC");
		
		}
}
