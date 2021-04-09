package day15_Method3;

public class calculateAge {

	public static void main(String[] args) {
	
		yearsUntilRetirement("Mike", 1990);
		
	}

	public static int calculateAge(int yearBirth) {
		
		return 2021-yearBirth;
		
	}
	public static void yearsUntilRetirement(String name, int year) {
		
		int retirementYear = 65 - calculateAge(year);
		
		System.out.println(name + " retires in " + retirementYear + " years");
	}
}

