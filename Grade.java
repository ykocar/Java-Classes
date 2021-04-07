package day13_Methods;

public class Grade {

	public static void main(String[] args) {
		
		Grade(100,100,100);
		Grade(100,50,75);
		Grade(90,55,0);

	}
	public static void Grade(int score1,int score2,int score3) {
		
		int score = (score1 + score2 + score3)/3;
		
		if(score >= 0 && score <= 100) { // if score is valid
			
			if(score >= 90) {  // fails : score < 90
				System.out.println("A");
			}else if(score >= 80) { // fails: score < 80
				System.out.println("B");
			}else if(score >= 70 ) { // fails: score < 70
				System.out.println("C");
			}else if(score >= 60  ) { // fails: score < 60
				System.out.println("D");
			}else {
				System.out.println("F");
			}
			
		}else { // if score is not valid
			System.out.println("Invalid Score");
			
		}
	}
}
