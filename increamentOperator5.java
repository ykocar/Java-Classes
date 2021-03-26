package Operators;

public class increamentOperator5 {

	public static void main(String[] args) {
	
	    int i = 1;
        i += ++i + i++ + ++i;
        //in memory: 1> 2> 2> 4 
        // result:1+ 2 + 2 + 4=9

        int j = 1;
        j += ++j + j++ + ++j;
        //in memory: 1> 2> 2> 4 
        // result:1+ 2 + 2 + 4=9
        
        int k = 1;
        k += k++ + k++ + ++k;
        //in memory: 1> 1> 2> 4 
        // result:1 + 1 + 2 + 4=8
        
        int m = 1; //2

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("m = " + (m += 1));
        
        

	}

}
