package day23_StringManipulation_Lab_RandomClass;

public class catDog {

	public static void main(String[] args) {
	
		String str = "catcatdoghihi";
		int counter1 = 0;
		int counter2 = 0;
		
		for (int i = 0; i < str.length()-2; i++) { 
			if (str.substring(i, i + 3).equals("cat")) { // equalsIgnoreCase method is for Cat and cat
				counter1++;

			}
			if (str.substring(i, i + 3).equals("dog")) {
				counter2++;

}
		}
		if(counter1==counter2) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
}
}