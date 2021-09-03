package com.Searching;
//gfg amazon interview question
public class InfiniteArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,5,8,12,15,17,23,27,36,47,50,76};   //infinite array
        int target = 23;
        System.out.println(ans(arr, target));

    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int temp = end + 1;

            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            }else
            if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;  //ans
            }
        }
        return -1;
    }
}
