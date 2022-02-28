package Assignemnt;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Indian Currency : ");
        int i = input.nextInt();
       double j = i*0.013;

        System.out.println("After Conversion to USD : "+ j);

    }
}
