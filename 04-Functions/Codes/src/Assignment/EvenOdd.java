package Assignment;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        evenodd(11);
    }
    static void evenodd(int num) {
        if (num % 2 == 0) {
            System.out.println("even number");
        }else {
            System.out.println("odd number");
        }
    }
}
