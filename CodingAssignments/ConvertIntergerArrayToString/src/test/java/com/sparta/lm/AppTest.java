package com.sparta.lm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
        int expected = 1234;
        int[] array = {1, 2, 3, 4};
        int actual = App.convertArrayToInteger(array);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Given a single integer in an array, return it as a single integer")
    void checkSingleIntegerConversion() {
        int expected = 1;
        int[] array = {1};
        int actual = App.convertArrayToInteger(array);
        Assertions.assertEquals(expected, actual);
    }
}