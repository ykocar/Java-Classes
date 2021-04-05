package week2;

public class SalaryCalculator {

	public static void main(String[] args) {

/*
 Task1: Arithmetic operators
    Create a class called SalaryCalculator, write a program that can calculate the tax, salary 
    and salary after tax based on the hourly rate & tax rate
                ex:
                         rate = 55;
                        taxRate = 0.3;         weeklyHours = 40;

                    then output will be:
                            your salary is: 105600 USD
                            your total tax is: 27456 USD
                            your income after tax is: 78144 USD

                Assume that a year has 48 weeks (excluding PTO)
 */

		int hourlyRate = 50; // dollars per hour
		double taxRate = 0.3; // percentage
		int weeklyHours = 40;// hours a week

		// annual salary before tax:

		int salary = (hourlyRate * weeklyHours) * 48;
		System.out.println("Your annual salary is: $" + salary);

		// total tax:

		double totalTax = salary * taxRate;
		System.out.println("Your annual tax is: $" + totalTax);

		// salary after tax:

		double salaryAfterTax = salary - totalTax;
		System.out.println("Your annual salary after tax is: $" + salaryAfterTax);

		// each month's salary

		double eachMonth = salaryAfterTax / 12;
		System.out.println("each month salary is: $" + eachMonth);

	}

}