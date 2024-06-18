package com.sparta.lm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

//Given an array of integers, convert them to a single int made up of the digits
//
//for example the array:
//
//int[] numbers = {1, 0, 2, 4}
//
//should return the int 1024.

public class AppTest {
    @Test
    @DisplayName("Given multiple integers in an array, return the combined integers as a single integer")
    void checkMultipleIntegerConversion() {
        int expected = 12534;
        int[] array = {1, 25, 3, 4};
        int actual = App.convertArrayToInteger(array);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"0, 0",
                "1, 1",
                "33, 33"})
    @DisplayName("Given a single integer in an array, return it as a single integer")
    void checkSingleIntegerConversion(int input, int expected) {
        int actual = App.convertArrayToInteger(new int[]{input});
        Assertions.assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Given that the array of integers has leading zeros, the returned integer should have no leading zeros")
    void checkIfLeadingZerosAreRemoved() {
        int expected = 1001;
        int[] array = {0, 0, 10, 0, 1};
        int actual = App.convertArrayToInteger(array);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Given the array is empty, check if method returns zero")
    void checkIfEmptyArrayReturnsZero() {
        int expected = 0;
        int[] array = {};
        int actual = App.convertArrayToInteger(array);
        Assertions.assertEquals(expected, actual);
        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + actual);
    }
}