
public class swapNumbers {

	public static void main(String[] args) {
	
		int a,b;
		a=5;
		b=7;
		
		System.out.println("--------------before swap-----------------");
		System.out.println("First number is: "+a+" and second number is: "+b);
		
		int temporary;
		temporary = a;
		a=b;
		b= temporary;
		
		System.out.println("---------------after swap------------------");
		System.out.println("First number is: "+a+" and second number is: "+b);

	}

}
