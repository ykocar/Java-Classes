package day8_controlFlowStatements_part2;

public class ternaryOperator {

	public static void main(String[] args) {
	
		
		String result;
		int score=88;
		
		if(score>60) {
			result = "pass";

		}else {
			result = "fail";
			}
		result = score>60 ? "pass" : "fail";
		
		System.out.println(result);
 	}

}


