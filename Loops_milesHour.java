package day_10_Loops;

public class Loops_milesHour {

	public static void main(String[] args) {

	System.out.println("KPH             MPH");
	System.out.println("--------------------");
	
	double MPH;
	for(int KPH=60;KPH<=130;KPH+=10) {
		
		MPH=KPH*0.6214;
		System.out.println(KPH+"\t\t" +MPH);
	}
	

	}

}
