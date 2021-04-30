package Assignment_10;

public class Question16_Assignment10 {

	public static void main(String[] args) {
		
	
		String word = "xxjavaxx";
		
		if (word.length()<4) {
			
			System.out.println("Invalid");
			
		}else {
			
			if (word.substring(0, 2).equals("ja") || (word.substring(1, 3).equals("ja"))) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
				
		}
		
			}
		
	}