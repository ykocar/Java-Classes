package day13_Methods;

public class age {

	public static void main(String[] args) {
	
		calculateAge(2021,2000);
		calculateAge(2021,1980);

	}
	public static void calculateAge(int currentYear,int birthYear) {
		
		int age = currentYear-birthYear;
		
		System.out.println(age);
}
}
