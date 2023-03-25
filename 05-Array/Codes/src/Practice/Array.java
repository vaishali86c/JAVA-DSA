package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] str = new String[4];

        for (int i = 0;i < str.length;i++) {
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
