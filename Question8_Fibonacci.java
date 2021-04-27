package Assignment8;

import java.util.Scanner;

public class Question8_Fibonacci {

    public static void main(String[] args) {
       
        System.out.println(fib(9));//0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
                                    //1  2  3  4  5  6  7  8  9   10 
    }

    
    public static int fib(int sum) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your number");
        int num =scan.nextInt();
        int num1=0;
        int num2=1;
        for (int i = 2; i<num; i++) {
            sum=num1+num2;
            num1=num2;
            num2=sum;


        }

        return sum;

    }
	}

//fibonacci(2) = 1+0 = 1
//fibonacci(3) = 1+1 = 2
//fibonacci(4) = 2+1 = 3
//fibonacci(5) = 3+2 = 5
//fibonacci(6) = 5+3 = 8
//fibonacci(7) = 8+5 = 13
//fibonacci(8) = 13+8 = 21
//fibonacci(9) = 21+13 = 34