package week3;

public class SwitchStatementPractice {

	public static void main(String[] args) {
	
		//boolean r = "Hello" == "Hola";
		//double d = 10d;
		//float f = 10f;
		//long l = 10l;
		
		int number = 20;
		
		switch(number) {
			
			case 10:
				System.out.println("A");
				break; //exits the switch
			case 11:
				System.out.println("B");
				break;
			case 12:
				System.out.println("C");
				break;
			default:
				System.out.println("D");
		}
	}

}
