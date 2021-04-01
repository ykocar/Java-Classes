package day9_switch;

public class trafficLightColors {

	public static void main(String[] args) {
	
		char color = 'r';
	
		switch(color) {
		
		case 'R': case 'r':
			System.out.println("red light");
			break;
		case 'O': case 'o':
			System.out.println("orange light");
			break;
		case 'G': case 'g':
			System.out.println("green light");
			break;
		default :
			System.out.println("Invalid light");
		}
				

	}

}
