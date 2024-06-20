package com.sparta.lm;

public class App {
    public static boolean hasThreeIdenticalNeighbouringIndices(int[] numbers) {
        if (numbers == null) {
            return false;
        }
        for (int i = 1; i < numbers.length-1; i++) {
            if (numbers[i-1] == numbers[i] && numbers[i] == numbers[i+1]) {
                return true;
            }
        }
        return false;
    }
}
