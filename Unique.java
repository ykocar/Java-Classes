package C_Y;

public class Unique {

	public static void main(String[] args) {
		/*
		 * write a program that can return the unique characters from a string ex:
		 * "aabcccd" output: bd
		 */

		String str = "aabcccd";
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}

			if (count == 1) {
				result += str.charAt(i);
			}
		}
		System.out.println(result);
	}

}
