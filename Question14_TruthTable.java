package Assignment8;

public class Question14_TruthTable {

	public static void main(String[] args) {	
		
		System.out.println(threeLocks(false, false, true));
	}
	public static boolean threeLocks(boolean a,boolean b,boolean c) {
		
		if((a==true && b==true) || (c==true)){
			return true;
		}else {
			return false;
		}
	}
	
	
}
