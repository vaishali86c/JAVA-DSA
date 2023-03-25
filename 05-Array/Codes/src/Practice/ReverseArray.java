package Practice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7};

        reverse(arr,0,5);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr,int start,int end) {
//         arr[0] = arr[start];
//         arr[arr.length-1] = arr[end];


        while (start < end) {
             //swap
//            for (int i = arr[start];i < arr.length;i++) {

                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;

            //}

        }

    }
//    }
}
