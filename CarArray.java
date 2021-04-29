package day24_Arrays_Part1;

public class CarArray {

	public static void main(String[] args) {
		
		String [] cars = {"Honda","Toyota","Nissan","BMW","Mercedes","Porsche"};
		
		boolean flag = false;
		
		for(int i=0; i<cars.length;i++) {
			if(cars[i].contains("Honda")) {
				
				flag =true;
				break;
			}
				
			}
		if(flag) {
			System.out.println("I found your car Honda in this array");
		}else
			System.out.println("not found it");
	
			
		
		
		

	}

}
