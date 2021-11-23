package restart.Searching;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {13,26,39,52,65},
                {5,10,15,20,25},
                {8,16,24,32,40},
                {2,4,6,8,10}
        };
        int target = 32;
       int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if (target == arr[row][col])
                    return new int[]{row, col};
            }
        }
        return new int[]{-1,-1};
    }



}
