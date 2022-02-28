package Assignemnt;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Input 1st Number : ");
        int a = input.nextInt();
        System.out.print("Input 2nd Number : ");
        int b = input.nextInt();

        if(a>b){
            System.out.println("Largest Number is : " +a );
        }
        else {
            System.out.println("Largest Number is : "+b);
        }
    }

}
