package Practice;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8};
        System.out.println(bs(arr,7,0, arr.length-1));
    }
    static int bs(int[] arr,int target,int s,int e) {
        if (s > e) {
            return -1;
        }

        int mid = s + (e - s) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[s] <= arr[mid]) {
            if (target >= arr[s] && target <= arr[mid]) {
                return bs(arr,target,s,mid-1);
            }else {
                return bs(arr,target,mid+1,e);
            }
        }
        if (target >= arr[mid] && target <= arr[e]) {
            return bs(arr,target,mid+1,e);
        }else {
            return bs(arr,target,s,mid-1);
        }
    }
}
