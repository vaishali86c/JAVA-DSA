package Practice;

import java.util.Arrays;

public class VarArg {
    public static void main(String[] args) {
        fun(2,3,4,5,6,6,7);
    }
    static void fun(int...v) {
        System.out.println(Arrays.toString(v));
    }
}
