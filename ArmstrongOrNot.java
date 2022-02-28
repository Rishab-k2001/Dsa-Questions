package Assignemnt;

import java.util.Scanner;

public class ArmstrongOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int sum=0;
        while (n>0){
            int r =n%10;

            System.out.println(sum);
        }
    }
}
