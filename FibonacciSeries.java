package Assignemnt;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Fibonacci Series You want to print : ");
        int n = input.nextInt();
        int n1 = 0;
        int n2=1;
        int n3 = 0;
        System.out.println("Fibonacci Series is : ");


        while (n3<=n){

            n1=n2;
            n2=n3;
            n3= n1+n2;
            System.out.println( n3);
        }
    }
}
