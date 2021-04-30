package Assignment_10;

public class Question23_sandwich {

	public static void main(String[] args) {
	
		String sandwich = "xxbreadjambreadyy";
		
		String word = "bread";
		
		int str1 = sandwich.indexOf(word);
		int str2 = sandwich.lastIndexOf(word);
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(sandwich.substring(7, str2));
		
		int count = 0;
		while(sandwich.contains(word)) {
			sandwich= sandwich.replaceFirst(word, "");
			count++;
		}
		
		System.out.println(count);
		if(count<2) {
			System.out.println("nothing");
		}
	
	}
			
				}
		
		
			
