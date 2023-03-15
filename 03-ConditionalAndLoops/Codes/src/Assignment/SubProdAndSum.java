package Assignment;
import java.io.*;
import java.util.*;
//program 2 -- subtract the sum and product of digits of an integers
public class SubProdAndSum {
    public static void main(String[] args) {

        int ans = proSum(4567);
        System.out.println(ans);

    }

    static public int proSum(int n) {
        int sum = 0;
        int prod = 1;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            prod = prod * rem;
            n /= 10;

        }
        return prod - sum;
    }
}

