package day11_loops;

public class Task_Loop_SumOfEvenNumbers {

	public static void main(String[] args) {
	
		
		int i=0;
	
		int sumOfEvenNumber=0;
		
		while(i<100) {
			if(i%2==0) {
				sumOfEvenNumber+=i;
				
			}
			i++;
		}	
			System.out.println(sumOfEvenNumber);
			
		
		}
		
		

	}


