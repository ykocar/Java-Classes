package Assignment3;

public class TotalSeconds {

	public static void main(String[] args) {
		
		int inputSeconds;
		int hours = 2;
		int minutes = 2 ;
		int seconds = 70;
		
		// 1 hour = 60 minutes, 3600 seconds
		// 1 minutes = 60 seconds
		
		inputSeconds = (hours * 3600) + (minutes * 60 ) + seconds;
		
		System.out.println("inputSecond is " + inputSeconds);
		
		System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds.");
		
		
		/*
		 Write a program that outputs the number of hours, minutes, 
		 and seconds that corresponds to input total seconds.

-Declare int variables inputSeconds, hours, minutes, seconds
-Initialize the inputSeconds

-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds 
are in inputSeconds.
-Assign values to the hours, minutes, seconds variables
-Display the result

       Sample Output:

       inputSecond is 3695

      1 hours, 1 minutes, and 35 seconds
		 */

	}

}
