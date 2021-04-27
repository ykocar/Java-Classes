package day23_StringManipulation_Lab_RandomClass;

public class hasBad {

	public static void main(String[] args) {
		
		String str = "xbadxx";
		
		if(str.substring(0, 3).equals("bad") || str.substring(1,4).equals("bad") ) {
			System.out.println(true);
			return;
		}else {
			System.out.println(false);
		}

	}

}
