package com.Searching;

import java.util.Arrays;

public class searchInRange {
    public static void main(String[] args) {
        int[][] nums = {{2,45,64,12},
                        {3,23,45},
                        {23,56,14,78}};
        int target = 12 ;
        int[] ans = linerSearch(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] linerSearch(int[][] arr, int target){

        if (arr.length == 0)
            return new int[]{-1, -1};

        for (int row=0; row<= arr.length; row++){
            for (int col=0; col<=arr[row].length; col++){
               if(arr[row][col] == target)
                   return new int[]{row, col};
            }
        }
        return new int[]{-1, -1};
    }
}
