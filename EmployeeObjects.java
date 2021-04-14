package day16_ClassAndObject;

public class EmployeeObjects {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		
		employee1.name="Mike";
		employee1.jobTitle="Worker";
		employee1.salary= 10_000;
		
		System.out.println("Employee name: " + employee1.name);
		System.out.println("Employee's title: " + employee1.jobTitle);
		System.out.println("Employee's annual salary is $"+ employee1.salary);
		
		System.out.println("***********************************");
		
		Employee employee2 = new Employee();
		employee2.name="Tom";
		employee2.jobTitle="Tester";
		employee2.salary= 20_000;
		
		System.out.println("Employee name: " + employee2.name);
		System.out.println("Employee's title: " + employee2.jobTitle);
		System.out.println("Employee's annual salary is $"+ employee2.salary);
		System.out.println("****************************");
		employee1.work();
		employee1.attendMeeting();
		employee1.introduce();
		System.out.println("*******************************");
		employee2.work();
		employee2.attendMeeting();
		employee2.introduce();
		
	}

}
