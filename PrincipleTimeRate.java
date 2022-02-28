package Assignemnt;

import java.util.Scanner;

public class PrincipleTimeRate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Principle : ");
        int P = input.nextInt();
        System.out.print("Input Time : ");
        int T= input.nextInt();
        System.out.print("Input Rate : ");
       float R= input.nextFloat();

        double SI= (P*T*R)/100;


        System.out.println("The Simple Intrust is : " + SI);
        double ANS= SI+P;
        System.out.println("Total Amount : "+ANS);
    }
}
