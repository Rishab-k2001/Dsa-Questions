package Assignemnt;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int temp = n;
        int sum=0;
        while (n>0){
            int r = n%10;
            sum= (sum * 10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
