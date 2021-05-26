package day33_Class_Objects_Constructors;

public class Mouse {
	
	int numTeeth;
	int numWhiskers;
	int weight;
	
	
	public Mouse(int weight) {
		this(30,20); //calling constructor - it should be at first line-we can call only one constructor
		this.weight = weight;
		JAVA
	}


	public Mouse(int numTeeth, int weight) {
		this(50,20,30);
		this.numTeeth = numTeeth;
		this.weight = weight;
		JS
	}


	public Mouse(int numTeeth, int numWhiskers, int weight) {
	
		this.numTeeth = numTeeth;
		this.numWhiskers = numWhiskers;
		this.weight = weight;
		C
	}
	
	public void print() {
		
		System.out.println(weight + " " + numTeeth + " "+ numWhiskers);
	}
	
	
	
	

}
