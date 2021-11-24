package restart.Searching;
//Given an array nums of integer, return how many of them contains even number of digits.
public class EvenNumberSearch {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896, 78};

        System.out.println(checkEven(nums));
    }

    static int checkEven(int[] arr){
        int counter = 0, ans;
        for (int i = 0; i < arr.length; i++){
            ans = countDigits(arr[i]);
            if (ans % 2 == 0)
                counter++;
        }
        return counter;
    }

    static int countDigits(int n){  //return (int)(Math.log10(num))+1;
        int r, count=0;
        while (n != 0){
            r = n % 10;
            n = n / 10;
            count++;
        }
        return count;
    }


}
