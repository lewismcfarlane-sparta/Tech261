package com.sparta.lm;

public class Utility {
    public static void factorial(int n) {
        int factorial = 1;
        for (int i=1; i<=n; i++) {

            factorial = i * factorial;

        }
        System.out.println(factorial);
    }
}
