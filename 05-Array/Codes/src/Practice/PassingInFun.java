package Practice;

import java.util.Arrays;

public class PassingInFun {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] arr) {
        arr[0] = 90;//array is mutable-change the object
        //string - immutable
    }
}
