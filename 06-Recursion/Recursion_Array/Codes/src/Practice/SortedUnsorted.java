package Practice;

public class SortedUnsorted {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,7,8};
        System.out.println(Sorted(arr,0));
    }

    static boolean Sorted(int[] arr,int index) {
        if (arr[index] == arr.length - 1) {
            return true;
        }

        return (arr[index] < arr[index + 1] && Sorted(arr,index + 1));
    }
}
