package Assignment;
//take two number as input and print the largest number

import java.util.Scanner;

public class ass5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = input.nextInt();

        System.out.println("Enter the second number:");
        int b = input.nextInt();

        a = 0;
        if (a > b) {
            System.out.println(a +" is  smallest number ");
        }else {
            System.out.println(b +"  is  largest number ");
        }

    }
}
