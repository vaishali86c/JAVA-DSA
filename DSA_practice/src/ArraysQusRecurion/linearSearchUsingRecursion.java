package ArraysQusRecurion;

import java.util.ArrayList;

public class linearSearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 5,};
        System.out.println(linearSearchIndex(arr, 5, 0));
        linearsearchAllIndex(arr, 3, 0);
        System.out.println(list);

        ArrayList<Integer> ans = find(arr,3,0,new ArrayList<>());
        System.out.println(ans);

        System.out.println(find2(arr,3,0));



    }

    static boolean linearSearch(int[] arr, int target, int index) {
        if (index == arr.length - 1) {
            return false;
        }
        return arr[index] == target || linearSearch(arr, target, index + 1);
    }

    //find all the index --which is double present in the array

    static ArrayList<Integer> list = new ArrayList<>();

    static void linearsearchAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }

        if (arr[index] == target) {
            list.add(index);
        }
        linearsearchAllIndex(arr, target, index + 1);
    }

    static int linearSearchIndex(int[] arr, int target, int index) {

        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return linearSearchIndex(arr, target, index + 1);

        }

    }

    static ArrayList<Integer> find (int[] arr, int target, int index,ArrayList<Integer> list) {

        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }

        return find(arr, target, index + 1,list);

    }

    static ArrayList<Integer> find2 (int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }
        //this will contain ans for that this call only
        if (arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ansFromLowCalls =  find2(arr, target, index + 1);

        list.addAll(ansFromLowCalls);

        return list;

    }

}