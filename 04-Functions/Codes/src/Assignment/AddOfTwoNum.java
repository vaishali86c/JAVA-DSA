package Assignment;

import java.util.Scanner;

public class AddOfTwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int num1 = input.nextInt();
        System.out.println("Enter the second number :");
        int num2 = input.nextInt();
        addoftwonum(num1,num2);
    }

    static void addoftwonum(int num1,int num2) {
        int sum = 0;
        sum = num1 + num2;
        System.out.println("sum of two number is " + sum );
    }
}
