package Assignment;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PrimeBetTwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        for (int i = a;i <= b;i++) {
            if ((primebetnum(i)) == true) {
                System.out.println(i);
            }
        }
    }

    static boolean primebetnum(int num) {
        int c = 2;
        if (num < 2) {
            return false;
        }
        while (num > c ) {
            if ( num % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
