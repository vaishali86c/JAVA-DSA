package Practice;

import java.util.ArrayList;

public class WithoutPassingArg {
    //returning a list without passing argument

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,5,5};
        System.out.println(FindAllIndex2(arr,5,0));
    }
    static ArrayList<Integer> FindAllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        //this will contain that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansforbelowcalls = FindAllIndex2(arr, target, index + 1);
        list.addAll(ansforbelowcalls);

        return list;
    }
}
