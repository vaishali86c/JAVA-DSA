package Assignment;

import java.util.Scanner;

// to calculate fibonacci series up to n numbers
public class ass7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 0;
        int b = 1;
        int c = 10;

        System.out.println(a+" "+b);
        for (int i=2;i<10;++i) {
            c = a + b;
            System.out.println(" "+c);
            a = b;
            b = c;
        }
    }
}
