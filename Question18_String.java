package Assignment_10;

public class Question18_String {
	
	public static void main(String[] args) {
		System.out.println(sep("Word","X",3));
		
	}

	public static String sep(String word, String sepetaror, int rep) {
        String last = "";
        for (int i = 0; i < rep; i++) {

            if (i == rep - 1) {
                last += word;
            } else {
                last += word + sepetaror;
            }
        }
        return last;
    }
}


