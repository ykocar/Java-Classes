package day33_Class_Objects_Constructors;

public class CarTest {

	public static void main(String[] args) {
	
		Car c1 = new Car();
		
		Car c2 = new Car("Honda", "Civic", 2020, 5000, "white");
		
		Car c3 = new Car("BMW", "320", 2017, 30000, "red");
		
		System.out.println(c1.make);
		System.out.println(c2.make);
		System.out.println();
		
		//1-new-invoke constructor
		//which constructor?
		//constructor with no arguments in Car class-default constructor

	}

}
