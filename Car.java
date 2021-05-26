package day33_Class_Objects_Constructors;

public class Car {

	String model;
	String make;
	int year;
	double mile;
	String color;

	//create Constructor
	
	public Car() {
		model = "Honda";
		make = "Civic";
		year = 2020;
		mile = 5000;
		color ="Red";
		
	}
	
	public Car(String mo, String ma, int yr, int ml,String cl) {
		
		model = mo;
		make = ma;
		year = yr;
		mile = ml;
		color = cl;
		
	}
	
	public Car(String model, String make, int year, double mile, String color) {
		
		this.model = model;
		this.make = make;
		this.year = year;
		this.mile = mile;
		this.color = color;
	}
	
	
	
}
