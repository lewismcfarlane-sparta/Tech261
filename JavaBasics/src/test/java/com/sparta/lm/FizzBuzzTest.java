package com.sparta.lm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTest {
    // Print numbers in order
    // If divisible by 3, print "Fizz"
    // If divisible by 5, print "Buzz"
    // If divisible by 3 and 5, print "FizzBuzz"

    @Test
    @DisplayName("Given an input of 0, FizzBuzz returns one")
    void checkInputOfOneFizzBuzzReturnsOne() {
        // Arrange
        int input = 0;
        String expected = "0";
        // Act
        String actual = FizzBuzz.getFizzBuzzFrom(input);
        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12})
    @DisplayName("Given a number is divisible by only 3, FizzBuzz returns Fizz")
    void checkInputDivisibleByOnlyThreeFizzBuzzReturnsFizz(int input) {
        // Arrange
        String expected = "Fizz";
        // Act
        String actual = FizzBuzz.getFizzBuzzFrom(input);
        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10})
    @DisplayName("Given a number is divisible by only 5, FizzBuzz returns Fizz")
    void checkInputDivisibleByOnlyFiveFizzBuzzReturnsFizz(int input) {
        // Arrange
        String expected = "Buzz";
        // Act
        String actual = FizzBuzz.getFizzBuzzFrom(input);
        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"2, 2",
                "4, 4",
                "7, 7",
                "8, 8"})
    void givenInputNotDivisibleByThreeOrFiveReturnsThatNumber(int input, String expected) {
        String actual = FizzBuzz.getFizzBuzzFrom(input);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test 15 for FizzBuzz")
    void givenInput15ReturnFizzBuzz() {
        int input = 15;
        String expected = "FizzBuzz";

        String actual = FizzBuzz.getFizzBuzzFrom(input);

        Assertions.assertEquals(expected, actual);
    }



}


