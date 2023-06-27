package BinarySearch_Practice;

public class bsAcendingDecending {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4};
//        int ans = binarySearchAcending(arr,6);
        int ans = binarySearchDecending(arr,7);
        System.out.println(ans);
    }

    static int binarySearchAcending(int[] arr,int target) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (target == arr[m]) {
                return m;
            }
            if (target < arr[m]) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return -1;


    }

    static int binarySearchDecending(int[] arr,int target) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (target == arr[m]) {
                return m;
            }
            if (target > arr[m]) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return -1;


    }
}
