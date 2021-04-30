package Assignment_10;

public class Question27_coverString {

	public static void main(String[] args) {

		coverString("apple", "pears");
	}

	public static String coverString(String str,String word) {
		
		String result="";
		if(!str.contains(word)) {
			System.out.println("["+str+"]");
		}
		if(str.contains(word)) {
		result = str.replace(word, "[" +word+ "]");
			
		}
		System.out.println(result);
		
			return result;
			
		
	}
}
