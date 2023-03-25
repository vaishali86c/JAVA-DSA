package Practice;

import java.util.ArrayList;

public class ReturningArrayList {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,5,5};
        ArrayList<Integer> ans = FindAllIndex(arr,5,0,new ArrayList<>());
        System.out.println(ans);
    }
    static ArrayList<Integer> FindAllIndex (int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        return FindAllIndex(arr, target, index + 1, list);
    }
}
