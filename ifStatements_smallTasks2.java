package day7_controlFlowStatements;

public class ifStatements_smallTasks2 {

	public static void main(String[] args) {
		
		//2-Write an if statement that multiplies payrate by 1.5 if hours is greater than 40
		
	double payRate,hours;
				
	payRate=1000;
	hours=30;
				
	if(hours>40) {
				
	payRate = payRate*1.5;	
					
	}
				
	System.out.println(payRate);

	}

}