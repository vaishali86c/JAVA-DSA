package Assignment;

import java.util.Scanner;

//qus 3 :write a program to input principal , time,and rate (P , T, R) from the user ans find simple interest
public class ass3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal:");
        int P = input.nextInt();

        System.out.println("Enter the time:");
        int T = input.nextInt();

        System.out.println("Enter the rate:");
        int R = input.nextInt();

        int simpleInterest = P * R * T;
        System.out.println("simple interest is "+simpleInterest);

    }
}
