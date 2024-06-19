package com.sparta.lm;

public class App {

    public static void main(String[] args) {
        int[] numbers = {0, 4, 5, 6, -3, -3, -3};
        checkIfAdjacentIndicesAreIdentical(numbers);
    }

    public static boolean checkIfAdjacentIndicesAreIdentical(int[] numbers) {
        if (numbers == null) {
            return false;
        }

    }
}
