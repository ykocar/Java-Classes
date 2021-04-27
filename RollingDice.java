package day23_StringManipulation_Lab_RandomClass;
import java.util.*;
public class RollingDice {

	public static void main(String[] args) {

		int num1;
		int num2;
				
		Scanner input = new Scanner(System.in);
		Random rn = new Random();
				
		String again = "y";
		
		do {
			System.out.println("Rolling the dice....");
			
			num1 = rn.nextInt(6)+1; // from 1 to 6
			num2 = rn.nextInt(6)+1;
			
			System.out.println("Their values are: " + num1 +" " + num2);
			
			System.out.println("Roll them again: (y=yes) ?");
			
			again = input.nextLine();
				
		}while(again.equalsIgnoreCase("y"));

}
}