package day33_Class_Objects_Constructors;

public class Rectangle {

	double length;
	double width;

	public void getArea() {

		System.out.println(length * width);
	}

	public Rectangle() {
		
		width = 5.4;
		length = 3.1;
		//if we create Constructor without parameters, it has fixed values

		// instantiate the object variables
	}

	public Rectangle(int a, int b) {

	}

	public Rectangle(double a, double b) {
		
		length = a;
		width = b;

	}
	

	
	

}
