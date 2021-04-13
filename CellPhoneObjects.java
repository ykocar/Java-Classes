package day16_ClassAndObject;

public class CellPhoneObjects {

	public static void main(String[] args) {
	
		CellPhone cellPhone1 = new CellPhone();
		
		cellPhone1.brand = "Iphone";
		cellPhone1.screenSize = 3.0;
		cellPhone1.color ="White";
		cellPhone1.price= 750;
		
		System.out.println("***CELL PHONE 1 VALUES***");
		System.out.println(cellPhone1.brand);
		System.out.println(cellPhone1.screenSize);
		System.out.println(cellPhone1.color);
		System.out.println(cellPhone1.price);
				
		CellPhone cellPhone2 = new CellPhone();
		
		cellPhone2.brand = "Samsung";
		cellPhone2.screenSize = 2.0;
		cellPhone2.color ="Silver";
		cellPhone2.price= 650;
		
		System.out.println("***CELL PHONE 2 VALUES***");
		System.out.println(cellPhone2.brand);
		System.out.println(cellPhone2.screenSize);
		System.out.println(cellPhone2.color);
		System.out.println(cellPhone2.price);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		cellPhone1.call();
		
		cellPhone1.message();
		
		cellPhone1.takeAphoto();	
		

	}

}
