package com.Searching;

public class PrintWithoutLoop {
    public static void main(String[] args) {
        String name = "Yogesh";
        String s = "i";
        s = s.replaceAll("i", "iiiiiiiiii");
        s = s.replaceAll("i", "iiiiiiiiii");
//        s = s.replaceAll("i", "iiiiiiiiii");


        s = s.replaceAll("i", name + "\n");
        System.out.println(s);
    }
}
