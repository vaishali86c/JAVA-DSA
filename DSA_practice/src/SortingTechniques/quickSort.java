package SortingTechniques;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        quicksort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quicksort (int[] nums, int low, int hi) {
        if (low >= hi) {
            return;
        }

        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while (s <= e) {
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        quicksort(nums, low, e);
        quicksort(nums, s, hi);

    }
}
