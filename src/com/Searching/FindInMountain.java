package com.Searching;
//leetCode Q. 1095
public class FindInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,2,0};
        int target = 3;
        System.out.println(Search(arr, target));
        }

        static int Search(int[] arr, int target){
            int peak= peakOfMountain(arr);
            int firstTry = orderAgnosticBS(arr, target, 0, peak);

            if (firstTry != -1) {
                return firstTry;
            }
            return orderAgnosticBS(arr, target, peak+1, arr.length-1);
        }

    static int peakOfMountain(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }


    static int orderAgnosticBS(int[] arr, int target, int start, int end){

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
