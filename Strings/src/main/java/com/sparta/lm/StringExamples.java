package com.sparta.lm;

public class StringExamples {
    public static void main(String[] args) {
        String string1 = "Hello"; // Strings are
        string1.toUpperCase(); // Immutable
        string1 = string1.toUpperCase();
//        System.out.println(string1);
//
//        System.out.println(string1.toCharArray());

        String string = String.valueOf(100);

        String name = "Manish";
        System.out.println("Hello " + name);
    }
}
