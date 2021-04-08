package Book_IntroductionToJava;

public class AreaPerimeterOfCircle {

	public static void main(String[] args) {
	
		final double PI = 3.14;
		double radius = 5.5;
		double area, perimeter;
		perimeter = 2 * radius * PI;
		area = radius * radius * PI;
		
		System.out.println(area);
		System.out.println(perimeter);
	}

}
