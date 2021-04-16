package day20_StringManipulation_Part2;

public class checkedString {

	public static void main(String[] args) {
		
		checkedString("a", "b");

	}

	public static void checkedString(String str1, String str2) {
	
		
		str1= "Your order confirmation number is XYZ";
		
		str2 = "confirmation";
		
		int x = str1.indexOf(str2);
		
		if(x>-1) {
		System.out.println(x);	
		}else {
		System.out.println("not found");
		}
	}
	
	
}
