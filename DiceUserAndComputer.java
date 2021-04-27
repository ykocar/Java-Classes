package day23_StringManipulation_Lab_RandomClass;

import java.util.Random;

public class DiceUserAndComputer {

	public static void main(String[] args) {

		Random rn = new Random();
		
		for(int i=1; i<=10;i++) {
			int user = rn.nextInt(6)+1;
			int computer = rn.nextInt(6)+1;
			System.out.println(user + " " +computer);
			if(user>computer) {
				System.out.println("user wins");
			}else if (computer>user) {	
				System.out.println("computer wins");
			}else {
				System.out.println("there is no winner");
			}
				
			
		}
		
	}

}
