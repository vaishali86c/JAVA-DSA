package Practice;

public class FindLastIndex {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,5,5};
        System.out.println(FindLastIndex(arr,5, arr.length-1));
    }
    static int FindLastIndex (int[] arr,int target,int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }else {
            return FindLastIndex(arr, target, index - 1);
        }
    }
}
