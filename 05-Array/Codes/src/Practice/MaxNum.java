package Practice;

public class MaxNum {
    public static void main(String[] args) {
        int[] arr = {1,2,33,4,5};
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int maxval = arr[0];

        for (int i = 0;i < arr.length;i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
