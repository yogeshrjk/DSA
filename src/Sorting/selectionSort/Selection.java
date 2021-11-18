package Sorting.selectionSort;

import java.util.Arrays;

/* The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.
     1) The subarray which is already sorted.
     2) Remaining subarray which is unsorted.
     In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray.
    {1,3,4,2,5}
    {1,2,4,3,5}
    {1,2,3,4,5}
    worst case = O(N^2)
    Best case = O(N^2)
    stable = No
 */
public class Selection {
    public static void main(String[] args) {
        int[] arr = {1,3,-4,5,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++){
        int last = arr.length-i-1;
        int maxIndex = getMaxIndex(arr, 0, last);
        swap(arr, maxIndex, last);
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i=0; i<= end; i++){
            if (arr[max] < arr[i])
                max = i;
        }
        return max;
    }
}
