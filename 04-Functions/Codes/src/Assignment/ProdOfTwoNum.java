package Assignment;

import java.util.Scanner;

public class ProdOfTwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int num1 = input.nextInt();
        System.out.println("Enter the second number :");
        int num2 = input.nextInt();
        prod(num1,num2);
    }

    static void prod(int num1,int num2) {
        int prod = 0;
        prod = num1 * num2;
        System.out.println("Product of two number is " + prod);
    }
}
