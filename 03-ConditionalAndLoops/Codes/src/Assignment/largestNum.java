package Assignment;

import java.util.Scanner;

//take an input till the user enter 0 and print the largest number from all
public class largestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the how many numbers you want to :");
        int num = input.nextInt();
        int a = 0;

        while (num > 0) {
            for (int i = 1;i <= num;i++) {
                System.out.println("enter the first number");
                int val = input.nextInt();
                if (val>a) {
                    a = val;

                }

            }
            break;
        }
        System.out.println("laregst number is:" + a);

    }
}

