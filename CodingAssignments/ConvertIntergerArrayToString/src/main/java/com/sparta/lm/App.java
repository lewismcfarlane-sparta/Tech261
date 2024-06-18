package com.sparta.lm;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
    }

    public static int convertArrayToInteger(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        } else {
            return convertArrayToStringToInteger(numbers);
        }
    }

    @SuppressWarnings("ReassignedVariable")
    public static int convertArrayToStringToInteger(int[] numbers) {
        String stringOfNumbers = Arrays.toString(numbers);
        stringOfNumbers = removeCharactersFromString(stringOfNumbers);
        return Integer.parseInt(stringOfNumbers);
    }

    @SuppressWarnings("ReassignedVariable")
    public static String removeCharactersFromString(String input) {
        input = input.replace("[", "");
        input = input.replace("]", "");
        input = input.replace(" ", "");
        input = input.replace(",", "");
        input = input.replace("-", "");
        return input;
    }
}
