package com.sparta.lm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    @DisplayName("Test")
    void checkIfInputArrayIsNull() {
        int[] input = null;
        boolean expected = false;

        boolean actual = App.checkIfAdjacentIndicesAreIdentical(input);

        Assertions.assertEquals(expected, actual);
    }
}
