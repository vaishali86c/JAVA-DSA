package Practice;

public class FindIndex {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,5,5};
        System.out.println(FindIndex(arr,5,0));
    }
    static int FindIndex (int[] arr,int target,int index) {
        if (index == arr.length) {
            return index;
        }

        if (arr[index] == target) {
            return index;
        }else {
            return FindIndex(arr, target, index + 1);
        }
    }
}
