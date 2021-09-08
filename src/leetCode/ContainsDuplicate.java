package leetCode;

import java.util.Arrays;

//Q.217
public class ContainsDuplicate {
    public static void main(String[] args) {
    int[] nums = {1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }
    static boolean containsDuplicate(int[] nums) {

        //#1st approach brute force

//    for (int i=0; i<nums.length-1; i++ ){
//        for (int j=i+1; j<nums.length-1; j++){
//            if (nums[i] == nums[j])
//                return true;
//        }
//    }
//    return false;
        //passed 20/20 Test cases but Time limit Exceeded

        //#2nd approach optimized
        Arrays.sort(nums);
        for (int i=0; i<nums.length-1; i++ ){
            if (nums[i] == nums[i+1])
                return true;
        }
        return false;
    }

}
