package Assignment8;

public class Question15_toDoList {

	public static void main(String[] args) {
		System.out.println(validateTask(true, 2, 1));
		System.out.println(validateTask(true, 3, 1));
		System.out.println(validateTask(false,3, 2));
	}
	public static boolean validateTask(boolean a, int taskIdNext, int taskIdCurrent) {
		
		boolean result = true;
		
        if ((a == true) && (taskIdNext==(taskIdCurrent+1))) {
            result = true;
        }else {
        	result=false;
        }
        return result;
}		
}