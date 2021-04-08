package Book_IntroductionToJava;

public class PerimeterOfRectangle {

	public static void main(String[] args) {
		
	/*	(Area and perimeter of a rectangle) Write a program that displays the area and
		perimeter of a rectangle with the width of 4.5 and height of 7.9 using the following
		formula:
		area = width * height
		perimeter = 2 * (width + height) 
		*/
	
		double width = 4.5;
		double height = 7.9;
		
		double perimeter, area;
		perimeter = 2 * (width+height);
		area = width * height;
		
		System.out.println(perimeter);
		System.out.println("***********");
		System.out.println(area);
		
	}

}
