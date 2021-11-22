package restart.Array;

import java.util.Scanner;
import java.util.ArrayList;
/*
ArrayList:
ArrayList is a part of collection framework and is present in java.util package.
It provides us dynamic arrays in Java.
Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed.
In c++ we have Vector in standard template library.
syntax:
ArrayList<data_type wrapper class> array_name = new ArrayList<>(initial capacity)
initialising the initial capacity is optional because it is dynamic.
e.g. ArrayList<Integer> list = new ArrayList<>(10);
here list is an object, so we can use ArrayList methods via this object.

methods:
        list.add(Integer e);   we can add more than initial capacity.
        list.set(int index, Integer element);
        list.get(index);
        list.remove(index);



 */
public class Array_List {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(34);
        list.add(35);
        list.add(36);

        System.out.println(list);  //[34, 35, 36]
        //we don't need Arrays.toString method in ArrayList
        System.out.println(list.contains(35)); //true
        list.remove(0);
        System.out.println(list);//[35, 36]
        list.set(0,99);
        System.out.println(list);//[99, 36]

        for (int i = 0; i < 5; i++){
            list.add(in.nextInt());
        }

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }


    }
}
