package Lab4;

public class Question18_UnluckyNumber {

	public static void main(String[] args) {

		int[] x = { 1, 2, 2, 1, 13, 3 };

		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] != 13) {
				sum += x[i];
			} else {
				break;
			}

		}
		System.out.println(sum);
	}

}
