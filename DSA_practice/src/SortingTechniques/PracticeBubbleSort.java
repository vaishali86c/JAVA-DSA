package SortingTechniques;

import java.util.Arrays;

public class PracticeBubbleSort {
    public static void main(String[] args) {
        int arr[] = {3, 4, 56, 2, 1, 89, 32, 54, 43, 32};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        bubbleSort1(arr);
        System.out.println(Arrays.toString(arr));

        bubbleSort2(arr);
        System.out.println(Arrays.toString(arr));

    }
    //first try bubblesort
    static void bubbleSort (int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }

        }
    }

    //2 nd bubble sort
    static void bubbleSort1 (int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - 1; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
    //3rd
    static void bubbleSort2 (int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
