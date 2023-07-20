package SortingTechniques;

import java.util.Arrays;

public class AllPracticeSearchigSorting {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
//        int target = 5;
//        int ans = linearSearch(arr, target);
//        System.out.println(ans);
//        int res = binarySearch(arr, target);
//        System.out.println(res);
//        bubbleSort(arr);
//        selectionSort(arr);
//        insertionSort(arr);
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    //linear search
    static int linearSearch (int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static int binarySearch (int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                s = mid + 1;
            }
            if (arr[mid] > target){
                e = mid - 1;
            }
        }
        return -1;
    }

    static void bubbleSort (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    //selection Sort
    static void selectionSort (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int maxIndex = getmaxIndex (arr, 0, last);
            //swap
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[last];
            arr[last] = temp;
        }
    }
    static int getmaxIndex (int[] arr, int start, int end) {
        int max = 0;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    //insertion sort

    static void insertionSort (int[] arr) {
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    static void cyclicSort (int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                //swap
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
    }

}
