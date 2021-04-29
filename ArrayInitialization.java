package day24_Arrays_Part1;

public class ArrayInitialization {

	public static void main(String[] args) {
		
		int [] myList = {10,20,30,40};
		
		String [] myArray = {"Apple","Orange","Watermelon"};
		
		System.out.println(myList[0]);
		System.out.println(myList[1]);
		System.out.println(myList[2]);
		System.out.println(myList[3]);
		
		System.out.println(myArray[0]);
		System.out.println(myArray[1]);
		System.out.println(myArray[2]);
		
		System.out.println(myArray.length);
		
		for(int i=0;i<myList.length;i++) {
			System.out.println(myList[i]);
		}
		
		for(int i=0;i<myArray.length;i++) {
			System.out.println(myArray[i]);
			
		}
		
		int[] scores = {80,90,100};
		
		int sum=0;
		
		for(int i=0;i<scores.length;i++) {
			sum+=scores[i];
			System.out.println("Sum is: "+ sum);
			System.out.println("Average is: "+ sum/scores.length);
		}
	
	}

}
