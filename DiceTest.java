package day34_Constructors_Cont;

public class DiceTest {

	public static void main(String[] args) {
	
		final int sixSides = 6;
		Dice sixDice = new Dice(sixSides);
		
		rollDice(sixDice);
		//I am calling method
		//which method?
	
	}
	
	public static void rollDice(Dice d) {
	//	Rolling a 6 sided dice
		System.out.println("Rolling a "+ d.getSides()+ " sided dice");
	
		// The dice's value : 5
		System.out.println("The dice's value :" + d.getValue());
	}

}
