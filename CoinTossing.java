package day23_StringManipulation_Lab_RandomClass;

import java.util.Random;

public class CoinTossing {

	public static void main(String[] args) {
		
		Random rn = new Random();
		
		for(int i=1;i<=10;i++) {
			
			if(rn.nextInt(2)==0) {
				System.out.println("Tails");    //Tail=0 Heads=1
			}else {
				System.out.println("Heads");
		}
	

	}

	}
}