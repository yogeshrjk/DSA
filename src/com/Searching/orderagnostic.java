package com.Searching;

public class orderagnostic {
    public static void main(String[] args) {

//        int[] arr = {-12, -8, -3, 1, 3, 6, 7, 8};
        int[] arr = {8, 7, 6, 3, 1, -3, -8, -12};
        int target = -3;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }

            if (isAsc){
                if (target < arr[mid]) {
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if (target > arr[mid]) {
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
