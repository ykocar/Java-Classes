package Assignment3;

public class Caffeine {

	public static void main(String[] args) {
	
		int numberOfMilligrams = 200;
		
		int numbersOfDrinks;
		
		int lethalOverdoseGram = 10;
		
		numbersOfDrinks = (lethalOverdoseGram * 1000)/ numberOfMilligrams;
		
		
		
		System.out.println("Number of milligrams in drink:" + numberOfMilligrams);
		System.out.println("It would take about " + numbersOfDrinks + " drinks for a lethal overdose");
	/*
	 Scientists estimate that roughly 10 grams of caffeine consumed at one time is a lethal overdose.

Write a program with a variable that holds the number of milligrams of caffeine in a 
drink and outputs how many drinks it takes to kill a person.

       Sample Output

      Number of milligrams in drink: 500
      It would take about 20 drinks for a lethal overdose
	 */

	}

}
