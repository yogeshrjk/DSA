package restart.Array;

public class Max_number {

    public static void main(String[] args) {

        int[] arr = {4, 6, 7, 8, 2, 1, 3, 9, 5};

        System.out.println(max(arr)); //9
        System.out.println(maxInRange(arr,2,5)); //8

    }

    static int max(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //maximum number in given range
    static int maxInRange(int[] arr, int start, int end){
        int max = arr[start];

        for (int i = start+1; i < end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}