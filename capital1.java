package day17_classObject_Part2;

public class capital1 {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount();
		
		acc1.accountHolder = "Mike Smith";
		
		acc1.accountNumber = 12345;
		
		acc1.deposit(250);
		
		acc1.showBalance();
		
		acc1.withdraw(300);
		
		acc1.showBalance();
		
		acc1.charge(50, "table");
		
		acc1.showBalance();
	}

}
