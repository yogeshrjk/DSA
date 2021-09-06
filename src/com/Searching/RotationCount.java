package com.Searching;
//find the rotation count in sorted array(the array has been rotated clockwise k times, find the value of k)
public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {6,7,8,3,4,5};
       int ans = rotationCount(arr);
        System.out.println(ans);
    }
    //first find the Pivot of the Rotated array
    static  int pivot(int[] nums){
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
            else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
//count rotation
    static int rotationCount(int[] arr){
        int count = 0;
        int pivot = pivot(arr);
        return pivot + 1;
    }
}
