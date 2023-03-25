package Practice;

import java.util.ArrayList;

public class FindAllIndex {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,5,5};
        FindAllIndex(arr,5,0);
        System.out.println(list);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void FindAllIndex (int[] arr,int target,int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        FindAllIndex(arr, target, index + 1);
    }


}
