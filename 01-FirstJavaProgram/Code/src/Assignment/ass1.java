package Assignment;

import java.util.Scanner;

//qus1 :write a program to print whether a number is even or odd , also take input from the user
public class ass1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the given number:");

        int n = input.nextInt();
         if (n%2==0) {
             System.out.println(n +" is even number");
         }else {
             System.out.println(n +"is odd number");
         }

    }

}
