package com.Searching;
//leetcode question
public class findNumber {

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));

    }


    static  int findNumbers(int[] arr){
        int count = 0;
        for (int i=0; i<arr.length; i++){ //for (int j : arr)
            if (even(arr[i])){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){

        int numberOfdigits = digits(num);
        return numberOfdigits % 2 == 0;
    }

    static int digits(int num){

        if (num < 0)
            num = num * -1;

        if (num == 0)
            return 1;


        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
}
