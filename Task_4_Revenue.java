package day7_controlFlowStatements;

public class Task_4_Revenue {

	public static void main(String[] args) {
	
	double revenue;
	double price = 10;
	int quantity = 600;
	revenue = price*quantity;
	
	double discountRate = 0;
	
	
	if(revenue>5000) {
		
	discountRate = revenue*0.1;
	
	revenue = revenue - discountRate;
	
	
	}
	System.out.println("revenue: " + revenue);	

	}

}
