package SortingTechniques;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        insertionSort1(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort (int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    break;
                }
            }
        }
    }
    static void insertionSort1 (int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else  {
                    break;
                }
            }
        }
    }
  }