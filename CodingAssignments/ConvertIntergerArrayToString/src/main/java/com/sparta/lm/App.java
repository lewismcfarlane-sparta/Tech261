package com.sparta.lm;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
    }

    public static int convertArrayToInteger(int[] numbers) {
        String numberString;
        numberString = Arrays.toString(numbers);
        numberString = removeCharactersFromString(numberString);
        int integer = Integer.parseInt(numberString);
        return integer;
    }

    public static String removeCharactersFromString(String input) {
        input = input.replace("[", "");
        input = input.replace("]", "");
        input = input.replace(" ", "");
        input = input.replace(",", "");
        return input;
    }



}
