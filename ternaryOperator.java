package day8_controlFlowStatements_part2;

public class ternaryOperator {

	public static void main(String[] args) {
	
		
		
		
		int x=1;
		System.out.println(x>2 ? x<4 ? 10 : 8 : 7);
		
		if(x>2) {
			if(x<4) {
				System.out.println(10);
			}else {
				System.out.println(8);
			}
		}else {
				System.out.println(7);
			}
			}

	}


