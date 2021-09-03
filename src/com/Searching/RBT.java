package com.Searching;

public class RBT {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 6;
         System.out.println(Search(arr, target));
    }

    static int Search(int[] arr, int target){
        int pivot = pivot(arr);

        if (pivot == -1){
            return binary(arr, target, 0, arr.length-1);
        }
        if (arr[pivot] == target){
            return pivot;
        }
        if (target >= arr[0]){
            return binary(arr, target, 0, pivot-1);
        }
        return binary(arr, target, pivot+1, arr.length-1);
    }
    static int binary(int[] arr, int target, int start, int end){

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
    static  int pivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            } else if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }




}
