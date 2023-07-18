package SortingTechniques;

import java.sql.Array;
import java.util.Arrays;

public class ls2 {
    public static void main(String[] args) {
        int arr[] = {10,3,5,1};
        //int target = 4;
       // int ans = linearSearch(arr, target);
        //System.out.println(ans);
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int linearSearch (int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static void bubbleSort (int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
