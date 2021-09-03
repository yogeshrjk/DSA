package com.Searching;

public class ceiling {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9,11,13,15,16,17};
        int target = 14; //ans = 8
        int ans = findTarget(arr, target);
        System.out.println(arr[ans]);
    }

    static int findTarget(int[] arr, int target){
            if (target > arr[arr.length-1])
                return -1;
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return start;
        //for floor question return end

    }
}
