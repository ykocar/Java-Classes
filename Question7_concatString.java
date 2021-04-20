package Lab3;

public class Question7_concatString {

	public static void main(String[] args) {
	
		System.out.println(comboString("Hello", "hi"));
		System.out.println(comboString("hi", "Hello"));
		System.out.println(comboString("aaa", "b"));
	}
	public static String comboString(String str1,String str2) {
		
		if(str2.length()<str1.length()) {
		String x= str2.concat(str1).concat(str2);
		return x;
		}else if (str1.length()<str2.length()) {
		String y= str1.concat(str2).concat(str1);
		return y;
		}else {
		return "Invalid input";
	}
		
		/*
		 ANOTHER SOLUTION FOR SECOND PART:
		public static String comboString(String str1,String str2) {
		String str;
		if(str1.length()>str2.length()) {
		str= str2.concat(str1).concat(str2);
		
		}else  {
		str= str1.concat(str2).concat(str1);
		{
		return str;		 
		 
		 */
}
}