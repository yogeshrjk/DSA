package Sorting.BubbleSort;
//bubbleSort/sinkingSort/exchangeSort
//Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
//example: {1,3,4,2,5}  1>3? if yes then swap
//{1,3,4,2,5}  3>4?
//{1,3,4,2,5}  4>2? swap
//{1,3,2,4,5} 4>5?
//{1,3,2,4,5} 1>3?
//{1,3,2,4,5} 3>2? swap
//{1,2,3,4,5} 3>4? ..........

import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
            sort(arr);
    }

    static void sort(int[] arr){
//#1st approach
        //always runs O(n^2) time even if the array is sorted. It can be optimized by stopping the algorithm if inner loop didn’t cause any swap.

//        for (int i = 0; i < arr.length; i++){
//        for (int j = i+1; j < arr.length; j++){
//            if (arr[i] > arr[j]){
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//    }
//        System.out.println(Arrays.toString(arr));


        //#2nd approach
        //optimized to O(N)
        boolean swapped;

        for (int i = 0; i < arr.length; i++){
            swapped = false;
            for (int j = 1; j< arr.length - i; j++){
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if array is already sorted, it means no swapping then break the loop
            if (!swapped) break;
        }
        System.out.println(Arrays.toString(arr));
    }

}

