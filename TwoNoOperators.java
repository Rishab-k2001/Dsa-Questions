package Assignemnt;

import java.util.Scanner;

public class TwoNoOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input 1st Number : ");
        int A=input.nextInt();
        System.out.print("Input 2nd Number : ");
        int B = input.nextInt();
        System.out.print("Input Operation You Want : ");
        String E = input.next();
        int S = A*B;
        int Add= A+B;
        int D=A/B;
        int M=A-B;

        if (E.equals("sum")){
            System.out.println("Sum of Numbers is: "+ Add);
        }
        else if(E.equals("product")){
            System.out.println("Product of Numbers is : "+ S);
        }
        else if (E.equals("divide")){
            System.out.println("Divison of Numbers is : "+ D);
        }
        else {
            System.out.println("Subtraction of Numbers is : "+ M);

        }
    }
}
