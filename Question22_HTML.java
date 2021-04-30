package Assignment_10;

public class Question22_HTML {

	public static void main(String[] args) {
	
		String html = "<!DOCTYPE html><html><head><title>Java</title></head><body><p id=\"myid\"></p></body></html>";
		
		String word = "myid";
		
		if(html.contains(word)) {
			System.out.println(word);
		}else {
			System.out.println("Invalid input!");
		}
		
		

	}

}
