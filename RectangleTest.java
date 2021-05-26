package day33_Class_Objects_Constructors;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle R1 = new Rectangle(5.4,3.2);
		
		System.out.println(R1.length);
		System.out.println(R1.width);
		
//		//new call the constructor and create the object
//		//constructor's role is to initialize object variables
//		//new keyword invokes the constructor
//		//which constructor?
//		//accepting 2 arguments whic are doubels
//		
//		
//		
//		System.out.println(R1.length);
//		System.out.println(R1.width);
//		
//		R1.length = 5.4;
//		R1.width = 3.2;
//		
//		R1.getArea();
		
		
		Rectangle R2 = new Rectangle();
		
		System.out.println(R2.length);
		System.out.println(R2.width);
	

		Rectangle R3 = new Rectangle();
		
		System.out.println(R3.length);
		System.out.println(R3.width);
	}

}
