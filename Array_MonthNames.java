package day24_Arrays_Part1;

import java.util.Scanner;

public class Array_MonthNames {

	public static void main(String[] args) {
	
		String[] months = new String[12];
		
		months[0]="January";
		months[1]="February";
		months[2]="March";
		months[3]="April";
		months[4]="May";
		months[5]="June";
		months[6]="July";
		months[7]="August";
		months[8]="September";
		months[9]="October";
		months[10]="November";
		months[11]="December";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the month index number");
		
		int month = input.nextInt();
		
		System.out.println("the month name is <" +months[month]+ ">");
		
		
		
	}

}
