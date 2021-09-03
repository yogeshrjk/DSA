package com.Searching;
//leetCode q.1672
public class maxWelth {
    public static void main(String[] args) {

    }

    static int maximumWelth(int[][] accounts){

        int ans = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            if (sum > ans)
                ans = sum;
        }
        return ans;
    }
}
