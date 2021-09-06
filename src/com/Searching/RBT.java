package com.Searching;

public class RBT {
    public static void main(String[] args) {
        int[] arr = {4,5,6,6,7,0,1,2};
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
            }
            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                // skip the duplicates

                // check if start is pivot
                if (start < end && nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }




}
