package com.Searching;

public class Main {

    public static void main(String[] args) {
        int[] nums = {20,2,45,23,12,42,56};
        int target = 56;
        int ans = linerSearch(nums, target);
        System.out.println(ans);
    }

    static int linerSearch(int[] arr, int target){

        if (arr.length == 0)
            return -1;

        for (int i=0; i<arr.length; i++){
            int element=arr[i];
            if (element == target)
                return i;
        }
        return -1;
    }
}