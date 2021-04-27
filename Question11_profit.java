package Assignment8;

public class Question11_profit {

	public static void main(String[] args) {
	
		System.out.println(c_profits(100, 1500));
		System.out.println(c_profits(20, 5));
		System.out.println(c_profits(100, 100));
	}
	public static String c_profits(int buyPrice, int sellPrice) {

	
		if(sellPrice>buyPrice) {
			return "profit";
		}else if(buyPrice>sellPrice) {
			return "loss";
		}else {
			return "no loss";
		}
	}
	
	

}
