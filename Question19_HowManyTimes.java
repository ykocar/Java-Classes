package Assignment_10;

public class Question19_HowManyTimes {

	public static void main(String[] args) {
		
		String str = "javaxjavajava";
		
		int count = 0;
		
		while(str.contains("java")) {
		str = str.replaceFirst("java", "");	
			count++;
		}
		System.out.println(count);

}
}