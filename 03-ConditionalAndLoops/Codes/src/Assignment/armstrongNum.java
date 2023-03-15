package Assignment;

import java.util.Scanner;

public class armstrongNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 153;
        int temp = n;
        int p = 0;

        while (n > 0) {
            int rem = n % 10;
            p = (p) + (rem * rem * rem);
            n = n / 10;
        }

        if (temp == p) {
            System.out.println("its a armstrong number ");
        } else {
            System.out.println("its is not a amstrong number ");
        }
    }
}
