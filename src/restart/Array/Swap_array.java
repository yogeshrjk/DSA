package restart.Array;

import java.util.Arrays;

public class Swap_array {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,2};
        System.out.println(Arrays.toString(arr)); //[4, 5, 6, 7, 2]
        swap(arr, 1,3);
        System.out.println(Arrays.toString(arr)); //[4, 7, 6, 5, 2]
    }

   static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
