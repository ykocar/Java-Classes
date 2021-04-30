package Assignment_10;

public class Question24_appearance {

	public static void main(String[] args) {

		String str = "We study java and javascript not python";
		String word1 = "java";
		String word2 = "python";

		int count1 = 0;
		while (str.contains(word1)) {
			str = str.replaceFirst(word1, "");
			count1++;
		}

		System.out.println(count1);

		int count2 = 0;
		while (str.contains(word2)) {
			str = str.replaceFirst(word2, "");
			count2++;
		}

		System.out.println(count2);

		if (count1 == count2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
