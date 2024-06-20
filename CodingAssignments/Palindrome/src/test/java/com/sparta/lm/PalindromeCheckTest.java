package com.sparta.lm;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeCheckTest {


    @Test
    public void checkIfPalindromeReturnsTrue() {
        String input = "racecar";
        boolean expected = true;
        boolean actual = PalindromeCheck.isPalindrome(input);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkIfNullStringReturnsFalse() {
        String input = null;
        boolean expected = false;
        boolean actual = PalindromeCheck.isPalindrome(input);

        Assertions.assertEquals(expected, actual);
    }
}
