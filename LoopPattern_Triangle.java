package Friday;

public class LoopPattern_Triangle {

	public static void main(String[] args) {
		
		
		
			for(int i=1;i<=7;i++) { // rows
			for(int j=1;j<=i;j++) { // columns
				System.out.print(j+ " ");
			}
			System.out.println(" "); // next line
		}
			for(int i=6;i>=1;i--) { //rows
				for(int j=1;j<=i;j++) { //columns
					System.out.print(j+ " ");
				}
				System.out.println(" ");
	}

	}
}
