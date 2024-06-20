package com.sparta.lm;

public class PalindromeCheck {

    public static void main(String[] args) {
        System.out.println(isPalindrome("raCecar"));
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("ll"));
        System.out.println(isPalindrome("race1234car"));
    }

    public static boolean isPalindrome(String word) {
        if (word == null || word.length() < 3) {
            return false;
        }

        String lowerCaseWord = word.toLowerCase();

        String reversedLowerCaseWord = new StringBuilder(lowerCaseWord).reverse().toString();

        return lowerCaseWord.equals(reversedLowerCaseWord);
    }
}

//strings can be null, strings can be empty
//no less than 3.
//    Create a method which checks if a word is a palindrome
//    A palindrome is at minimum 3 characters long and is the same for
//    The method should be case insensitive
