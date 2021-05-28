package day34_Constructors_Cont;

public class AppleTest {

	public static void main(String[] args) {
	
		//the purpose is how to pass object to my Method parameter
		Apple apple = new Apple();
		//reference type reference variable = object
		//apple.color = "Green";
		changeApple(apple);
		System.out.println(apple.color);
		
		System.out.println(methodObject().color);
		
	}
	
	public static void changeApple(Apple a1) {
		//this is a bridge between outside of the method and local variable
	
		a1.color = "White";
		
	}
	public static Apple methodObject() {
		Apple b1 = new Apple();
		//b1.color = "blue";
		return b1;
	}

}
