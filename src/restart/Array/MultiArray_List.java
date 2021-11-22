package restart.Array;
/*
MultiDimensional ArrayList:
it is little tricky to implement multidimensional ArrayList
syntax:
     ArrayList<ArrayList<data_type wrapper class>>  list = new ArrayList<>();
     we have to pass an ArrayList as a data_type
        now run a loop to add arrays inside an array

 */
import java.util.ArrayList;
import java.util.Scanner;

public class MultiArray_List {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>>  list = new ArrayList<>();

//        Initialisation

        for (int i = 0; i < 3; i++){
            list.add(new ArrayList<>());
        }

//        add elements

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);
    }
}
