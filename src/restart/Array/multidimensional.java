package restart.Array;

import java.util.Arrays;

/*
multidimensional array/ 2D array

It is like an array of arrays,

    syntax:
    data_type[][] array_name = new data_type[row_size][col_size]
    column size is optional but row size is mandatory
    another way is:
        data_type[][] array_name = {
            {},
            {}
            }
    e.g.
        int [][] arr = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
                 }
 Column can vary for each array, that is why initialising the size of column is not mandatory.

 */
public class multidimensional {
    public static void main(String[] args) {
int[][] arr = {
        {3,4,6},
        {6,7,2},
        {3,7,3,1}
    };
//print array
        //by for loop traditional way

//    for (int row = 0; row < arr.length; row++){
//        for (int col = 0; col < arr[row].length; col++){
//            System.out.print(arr[row][col] + " ");
//        }
//        System.out.println(" ");
//    }

        //by Arrays.toString method

//        for (int row = 0; row < arr.length; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

        //by enhanced for loop

        for (int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
