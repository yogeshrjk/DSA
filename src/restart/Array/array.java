package restart.Array;

/*
Array is a group of similar elements.
syntax:
    datatype[] array_name = new datatype[size];
    e.g. store 5 roll number.
    int[] roll = new int[5];
    or
    int[] roll = {3,4,5,6,7};

    Declaration of an array is happens at compile time while the initialization of an array is happens at runtime this is basically known as dynamic memory allocation.
    Dynamic memory allocation: assigning the memory space during the execution time or runtime.

    In c/c++ array objects are continuous but...
    array objects in java may not continuous because:
    1) we know that array objects are in heap
    2) heap object are in heap
    3) because of dynamic memory allocation
    Hence it may not be continuous, and it depends on JVM

    array elements are accessed by its indices, index number is always start from 0

    |''''|''''|''''|''''|''''|''''|
    |____|____|____|____|____|____|
       0   1    2    3    4    5

    ~ What is new keyword?
    new is a keyword which is used to create an object

    A mutable object can be changed after it's created, and an immutable object can't.
    In Java, everything (except for strings) is mutable by default.
    Strings are immutable in Java.
 */

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] roll; //declaration of array, roll is being defined in the stack
        roll = new int[5]; //initialization of array, object is being created in heap memory

        for (int i = 0; i < roll.length; i++){
            roll[i] = in.nextInt();
        }
//Print Array
        //by for loop traditional way
//        for (int i = 0; i < roll.length; i++){
//            System.out.print(roll[i] + " ");
//        }

        //Enhanced for loop
//        for (int i : roll){ //i = element of the array
//            System.out.print(i + " ");
//        }

        //Arrays.toString method
        System.out.println(Arrays.toString(roll));
    }

}
