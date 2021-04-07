package day13_Methods;

public class HoursPay {

	public static void main(String[] args) {
		
		
		payment(40, 100);
	}

	public static void payment(int hours, double hourlyPay) {
		double totalPay = hours*hourlyPay;
		System.out.println(totalPay);
	}
}
