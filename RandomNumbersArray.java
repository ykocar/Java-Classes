package day24_Arrays_Part1;

import java.util.Random;

public class RandomNumbersArray {

	public static void main(String[] args) {
		
		int[] numbers = new int[10];
		
		for(int i=0;i<numbers.length;i++) {
			
		Random rn=new Random();
			
		numbers[i]= rn.nextInt(100);
		
		System.out.println(numbers[i]);

	}

}
}