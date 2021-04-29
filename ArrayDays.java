package day24_Arrays_Part1;

import java.util.Scanner;

public class ArrayDays {

		public static void main(String[] args) {
			
			String[] days = new String[7];
			
			days[0]="Mon";
			days[1]="Tue";
			days[2]="Wed";
			days[3]="Thur";
			days[4]="Fri";
			days[5]="Sat";
			days[6]="Sun";
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter the day index number:");
			
			int day = input.nextInt();
			
			System.out.println("the day name is <" +days[day]+ ">");

	}

}
