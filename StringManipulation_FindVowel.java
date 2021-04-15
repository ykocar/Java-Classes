package day19_stringManipulation;

public class StringManipulation_FindVowel {

	public static void main(String[] args) {
		
		String word ="CybertekSchool";
		
		
		for(int i=0;i<word.length();i++) {
			if (word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='o' || word.charAt(i)=='i' ||
					word.charAt(i)=='u') {
				System.out.print(word.charAt(i) + " ");
		
				if(i !=word.length()-2) {					
					System.out.print(",");
					
				}
			}
		}

	}

}
