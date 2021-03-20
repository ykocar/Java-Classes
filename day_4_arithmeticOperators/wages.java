package day_4_arithmeticOperators;

//This program calculates hourly wages plus overtime
public class wages {

	public static void main(String[] args) {
		
		double regularWage; // The calculated regular wage
		double basePay=25.50; //base pay
		double regularHours=40; // the hours worked less overtime
		double overTimeWages; //Overtime wages
		double overTimePay=37.5; //overtime Pay rate
		double overTimeHours=10;
		double totalWage; // Total Wage
		
		regularWage=basePay*regularHours;
		overTimeWages=overTimeHours*overTimePay;
		
		totalWage=regularWage+overTimeWages;
		
		System.out.println("Wages for this week are $ " + totalWage);
		
		

	}

}
