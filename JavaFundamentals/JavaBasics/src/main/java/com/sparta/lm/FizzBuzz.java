package com.sparta.lm;

public class FizzBuzz {
    public static String getFizzBuzzFrom(int number) {
        String fizzBuzzString = Integer.toString(number);
        if (number % 5 == 0 && number % 3 == 0) {
            fizzBuzzString = "FizzBuzz";
        } else if (number % 3 == 0) {
            fizzBuzzString = "Fizz";
        } else if (number % 5 == 0) {
            fizzBuzzString = "Buzz";
        }
        return fizzBuzzString;
    }

    public static void main(String[] args) {
        for (int i=1; i<=15; i++) {
            System.out.println(FizzBuzz.getFizzBuzzFrom(i));
        }
    }
}
