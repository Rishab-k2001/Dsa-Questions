package Assignemnt;

import java.util.Scanner;

public class greetingMessage {
    public static void main(String[] args) {
        Scanner input  =  new Scanner(System.in);
        System.out.print("Whats Your Name : ");
        String a = input.next();
        String b ="Rishab";
        String c = "Sonal";

        if (a.equals("Rishab")){
            System.out.println("Greetings Rishab Sir");

        }
        else if (a.equals("Sonal")){
            System.out.println("Greetings Sonal Mam");
        }
        else {
            System.out.println("Hello"+" " + a);

        }
    }
}
