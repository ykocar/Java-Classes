package day24_Arrays_Part1;

public class Array_Score {

	public static void main(String[] args) {
		
		int [] scores = new int [5];
		
		
		scores[0] = 88;
		scores[1] = 85;
		scores[2] = 90;
		scores[3] = 100;
		scores[4] = 85;
		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);
		
		int avgScore2 = scores[0]+scores[1]+scores[2]+scores[3]+scores[4];
		System.out.println(avgScore2);
		
		
		
		
	}

}
