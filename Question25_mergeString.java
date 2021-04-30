package Assignment_10;

public class Question25_mergeString {

	public static void main(String[] args) {
	
	String s1 = "wooden";
	String s2 = "spoon";
	
	mergeStrings(s1,s2);

	}
	
	public static void mergeStrings(String s1, String s2) {

        String result = "";

        for (int i = 0; i < s1.length() || i < s2.length(); i++) {

            if (i < s1.length())
                result += s1.charAt(i);

            if (i < s2.length())
                result += s2.charAt(i);
        }

        System.out.println("result = " + result);
    }
		
		
	
		
		}
