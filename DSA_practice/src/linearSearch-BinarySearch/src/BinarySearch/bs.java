package BinarySearch;

public class bs {
    public static void main(String[] args) {
        int[] arr = {1,2,5,7,8,9};
        int target = 9;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch (int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
