package Friday;

public class fff {

	public static void main(String[] args) {

        int num=0;
        int endNumber=11;


        while(num<endNumber) {
            num++;
            if(num%2==1) {

                System.out.print(num);
                if(num!=endNumber) {
                     System.out.print(",");
                 }
            }
	}

	}
}