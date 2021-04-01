package day9_switch;

public class task1 {

	public static void main(String[] args) {
	
		String laptop = "apple";
		
		switch (laptop) {
		
		case "apple":
			System.out.println("no virus");
			break;
		case "dell":
			System.out.println("tough one");
			break;
		case "acer" :
			System.out.println("not recommended");
			break;
		default:
			System.out.println("do not buy that one");
		
		
		}
	
	}

}
