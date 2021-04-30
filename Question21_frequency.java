package Assignment_10;

public class Question21_frequency {

	public static void main(String[] args) {

		String str = "abXYab";
		
		int x= 1;
		int count=0;
		String s = str.substring(0, x);
		
		for(int i=0;i<str.length();i++) {
			if(str.substring(x).contains(s)) {
				count++;
						
			}
			}
		if (count>1) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
			

	}

}
