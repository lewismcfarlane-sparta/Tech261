package com.sparta.lm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    @DisplayName("Check if returns false when array is null")
    void checkIfInputArrayIsNull() {
        int[] input = null;
        boolean expected = false;

        boolean actual = App.hasThreeIdenticalNeighbouringIndices(input);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Array with no three adjacent identical numbers")
    void checkIfInputArrayReturnsFalseWithNoThreeAdjacentIdenticalIndices() {
        int[] input = {0, 1, 2, 4, 3, 4, 5};
        boolean expected = false;
        boolean actual = App.hasThreeIdenticalNeighbouringIndices(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Three adjacent identical neighbours in the middle")
    void checkIfInputArrayFindsThreeAdjacentIdenticalNumbersInTheMiddle() {
        int[] input = {0, 1, 1, 4, 4, 4, 5};
        boolean expected = true;
        boolean actual = App.hasThreeIdenticalNeighbouringIndices(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Three adjacent identical neighbours at the start")
    void checkIfInputArrayFindsThreeAdjacentIdenticalNumbersAtTheStart() {
        int[] input = {1, 1, 1, 0, 4, 4, 5};
        boolean expected = true;
        boolean actual = App.hasThreeIdenticalNeighbouringIndices(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Three adjacent identical neighbours at the end")
    void checkIfInputArrayFindsThreeAdjacentIdenticalNumbersAtTheEnd() {
        int[] input = {0, 1, 1, 3, 4, 4, 4};
        boolean expected = true;
        boolean actual = App.hasThreeIdenticalNeighbouringIndices(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Arrays of length 2 return false")
    void returnFalseIfArrayLengthIsTwo() {
        int[] input = {1, 1};
        boolean expected = false;
        boolean actual = App.hasThreeIdenticalNeighbouringIndices(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Arrays of length 1 return false")
    void returnFalseIfArrayLengthIsOne() {
        int[] input = {1, 1};
        boolean expected = false;
        boolean actual = App.hasThreeIdenticalNeighbouringIndices(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Arrays of length 0 return false")
    void checkIfReturnsFalseForEmptyArrays() {
        int[] input = {};
        boolean expected = false;
        boolean actual = App.hasThreeIdenticalNeighbouringIndices(input);
        Assertions.assertEquals(expected, actual);
    }

}
