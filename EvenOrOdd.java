package Assignemnt;

import java.util.Scanner;
import java.util.SortedMap;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a Number : ");
        int num = input.nextInt();

        if(num%2==0){
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
    }
}
