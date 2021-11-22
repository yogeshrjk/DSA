package restart.Array;

import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr = {3,6,2,7,1,9,8,5};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void reverse(int[] arr){
        int start = 0, end = arr.length-1;
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
