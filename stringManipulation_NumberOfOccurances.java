package day19_stringManipulation;

import java.util.Iterator;

public class stringManipulation_NumberOfOccurances {

	public static void main(String[] args) {
	
		
		String word = "abcabqcabc";
		
		int counter=0;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)=='a') {
				counter++;
			}
			
		}
		System.out.println("Number of a in this string is: "+ counter);

	}

}
