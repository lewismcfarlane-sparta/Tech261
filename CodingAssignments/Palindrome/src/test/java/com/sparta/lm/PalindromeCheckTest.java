package com.sparta.lm;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
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

    @Test
    public void checkIfStringOfLength2ReturnsFalse() {
        String input = "ll";
        boolean expected = false;
        boolean actual = PalindromeCheck.isPalindrome(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkThatPalindromeCheckIgnoresCaseSensitivity() {
        String input = "RacECAr";
        boolean expected = true;
        boolean actual = PalindromeCheck.isPalindrome(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkRemoveSpecialCharactersRemovesSpecialCharacters() {
        String input = "1@Race@car!!";
        String expected = "Racecar";
        String actual = PalindromeCheck.removeSpecialCharacters(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkRemoveSpecialCharactersRemovesOnlySpecialCharacters() {
        String input = "1@Race@car!! ^ra!ceCar^^";
        String expected = "Racecar raceCar";
        String actual = PalindromeCheck.removeSpecialCharacters(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkIfGetPalindromeListReturnsListOfPalindromes() {
        String input = "racecar follow madam";
        String expected = "racecar madam";
        String actual = PalindromeCheck.getPalindromeList(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkIfGetLongestPalindromeReturnsLongestPalindromes() {
        String input = "racecar madam bbbooolll";
        String expected = "bbbooolll";
        String actual = PalindromeCheck.getLongestPalindromes(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkIfGetLongestPalindromesReturnsPalindromesOfSameLength() {
        String input = "rracecarr madam bbbooolll";
        String expected = "rracecarr bbbooolll";
        String actual = PalindromeCheck.getLongestPalindromes(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkIfWhitespaceAffectsPalindromeReturn() {
        String input = "race car";
        boolean expected = false;
        boolean actual = PalindromeCheck.isPalindrome(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Method ignores repeat palindromes")
    public void checkIfGetPalindromeListIgnoresRepeatPalindromes() {
        String input = "dad dad muum daad muum daad daad";
        String expected = "muum daad";
        String actual = PalindromeCheck.getLongestPalindromes(input);
        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    @DisplayName("Main test")
    public void mainTest() {
       String input = "da31413d!! 433! mu 34m m!u^^^m mam aaa bbb ccc";
       String expected = "dad mum mam aaa bbb ccc";
       String actual = PalindromeCheck.getLongestPalindromesFromInput(input);
    }

    @Test
    @DisplayName("Return empty string if no palindromes are found")
    public void noPalindromesInString() {
        String input = "abc dedf fdasf lfldl lewis";
        String expected = "";
        String actual = PalindromeCheck.getLongestPalindromesFromInput(input);
        Assertions.assertEquals(expected, actual);
    }







}
