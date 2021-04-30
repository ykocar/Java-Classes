package Assignment_10;

public class Question30_at3 {

	public static void main(String[] args) {
		System.out.println(at3("longword", "foo"));
	}

	public static String at3(String s1, String s2) {

		String result = "";
		for (int i = 0; i < s1.length(); i++) {

			result += s1.charAt(i);

			if (i == 2) {

				result += s2;
			}

		}
		return result;
	}
}