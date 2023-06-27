package SortingTechniques;

import java.util.Arrays;

public class inPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 7, 8, 9};
        mergeSort(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void  mergeSort (int[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }

        int mid = (start + end) / 2;

        //divide array into two parts left and right

        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);


        merge(arr, start, mid, end);
    }

    static void merge(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        //remaining elements and merge
        //copy the remaining elements
        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < end) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];
        }
    }

}
