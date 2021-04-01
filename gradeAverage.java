package day8_controlFlowStatements_part2;

public class gradeAverage {

	public static void main(String[] args) {
	
	int history = 70;
	int math = 50;
	int chemistry = 90;
	
	double average;
	
	average = (history+math+chemistry)/3;
	System.out.println("average is: "+average);
	
	if (average>=0 && average<=59) {
	System.out.println("score is F");
	}else if((average>=60) && (average<=69)) {
	System.out.println("score is D");
	}else if((average>=70) && (average<=79)) {
	System.out.println("score is C");
	}else if((average>=80) && (average<=89)) {
	System.out.println("score is B");
	}else if((average>=90) && (average<=100)) {
	System.out.println("score is A");
	}else
	System.out.println("invalid score");
	
	

}
}