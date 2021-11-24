package restart.Searching;

public class ReachestCustomer {
    public static void main(String[] args) {
        int[][] arr = {
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };

        System.out.println(reach(arr));
    }

    static int reach(int[][] arr){
        int reach = 0;
        for (int i = 0; i < arr.length; i++){
            int total = 0;
            for (int j = 0; j < arr[i].length; j++){
                total += arr[i][j];
            }
            if (total > reach){
                reach =total;
            }
        }
        return reach;
    }

}
