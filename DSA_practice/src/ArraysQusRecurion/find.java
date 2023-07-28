package ArraysQusRecurion;

import java.util.ArrayList;

public class find {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,5,6};
        System.out.println(find1(arr,0,5));
        System.out.println(findIndex(arr, 5, 0));
        findAllIndex(arr,4,0);
        System.out.println(list);
    }

    static boolean find1 (int[] arr, int index, int target) {
        if (index == arr.length) {
            return false;
        }

        return arr[index] == target || find1(arr, index + 1, target);
    }

    static int findIndex (int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }

    //not understand
//    static int findLastIndex (int[] arr, int target, int index) {
//        if (index == -1) {
//            return -1;
//        }
//        if (arr[index] == target) {
//            return target;
//        } else {
//            return findLastIndex(arr, target, index - 1);
//        }
//    }

    //find all target in the array

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex (int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }
}
