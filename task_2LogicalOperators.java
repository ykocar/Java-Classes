package day6_logicalOperators;

public class task_2LogicalOperators {

	public static void main(String[] args) {
		
		String outsideWeather;
		
		int degree;
		
		outsideWeather = "Shiny";
		
		degree=70;
		
		boolean comp = (!(outsideWeather=="Rainy" || degree==70));
		//F || T = T----   !T=F
		
		System.out.println(comp);

	}

}
