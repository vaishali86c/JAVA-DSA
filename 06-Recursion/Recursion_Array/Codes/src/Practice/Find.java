package Practice;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr = {2,3,5,5,5};

        System.out.println(Search(arr,4,0));
    }

    static boolean Search (int[] arr,int target,int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || Search(arr,target,index + 1);
    }
}
