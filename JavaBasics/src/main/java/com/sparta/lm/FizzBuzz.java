package com.sparta.lm;

public class FizzBuzz {
    public static String getFizzBuzzFrom(int number) {
        String fizzBuzzString = Integer.toString(number);
        if (number % 3 == 0) {
            fizzBuzzString = "Fizz";
        }
        if (number % 5 == 0) {
            fizzBuzzString = "Buzz";
        }
        if ((number % 5 == 0) && (number % 3 == 0)) {
            fizzBuzzString = "FizzBuzz";
        }
        return fizzBuzzString;
    }
}
