package linearSearch;

import java.util.Arrays;

public class ls {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println((linearSearch(arr,5, 4)));
    }

    static int linearSearch(int[] arr, int n, int target) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
