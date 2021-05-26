package day33_Class_Objects_Constructors;

public class StudentTest {

	public static void main(String[] args) {
	
		Student student1 = new Student("Mike", 17, 'M', 2016, "Java");
		
		Student student2 = new Student("Smith", 18, 'M', 2015, "JS");
		
		Student student3 = new Student("Mary", 19, 'F', 2017, "TS");
		
		student1.attendLecture();
		student1.attendLab();
	}

}
