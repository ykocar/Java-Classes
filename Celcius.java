package day13_Methods;

public class Celcius {

	public static void main(String[] args) {
	
		calculateCelcius(50);
	}
	public static void calculateCelcius(double fahrenheit) {
		
		double celcius=(fahrenheit- 32)/1.8;
		 System.out.println(celcius + " celcius");
		
		
	}
}
