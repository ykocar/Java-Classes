package Book_IntroductionToJava;

public class Population {

	public static void main(String[] args) {
		
	double currentPopulation = 312.032;
	
	int SumOfBirth;
	int SumOfDeath;
	int SumOfImmigrant;
	
	SumOfBirth = (365*24*3600)/7;
	SumOfDeath = (365*24*3600)/13;
	SumOfImmigrant = (365*24*3600)/45;
	
	int totalPopulation= (SumOfBirth+SumOfImmigrant)-SumOfDeath;
	
	double nextYearPopulation = totalPopulation + currentPopulation;
	
	System.out.println(nextYearPopulation);
	
		
		
		
		/*
		 (Population projection) The U.S. Census Bureau projects population based on the
following assumptions:
One birth every 7 seconds
One death every 13 seconds
One new immigrant every 45 seconds
Write a program to display the population for each of the next five years. Assume the
current population is 312,032,486 and one year has 365 days. Hint: In Java, if two
integers perform division, the result is an integer. The fractional part is truncated. For
example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with
the fractional part, one of the values involved in the division must be
		 */

	}

}
