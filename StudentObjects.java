package week10;

public class StudentObjects {

	public static void main(String[] args) {
			
			System.out.println( CybertekStudents.schoolName );
			
			System.out.println(CybertekStudents.programmingLanguage);
			
			CybertekStudents student1 = new CybertekStudents("Baris", 28, "EU 5");
			
			CybertekStudents student2 = new CybertekStudents("Zina", 25, "EU 4");
			
			System.out.println(student1);
			System.out.println(student2);
			

	}
}
