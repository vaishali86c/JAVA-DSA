package Assignment;

import java.util.Scanner;

public class pallindromeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

       // System.out.println("Enter the number ");
        int num = 22000022;
        int temp = num;

        while (num > 0) {
            int rem  = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }
        System.out.println(sum);
        if (temp == sum) {
            System.out.println("it is pallindrome number");
        }else{
            System.out.println("it is not a pallindrome number");
        }
    }


}
