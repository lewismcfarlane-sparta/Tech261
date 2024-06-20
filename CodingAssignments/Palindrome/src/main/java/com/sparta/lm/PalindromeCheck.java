package com.sparta.lm;

import java.util.*;

public class PalindromeCheck {

    public static void main(String[] args) {
        String input = "tree Radar muuuum dad rAdaR l/evel! mum r0ot?oR";
        String longestPalindromes = getLongestPalindromesFromInput(input);
        System.out.println(longestPalindromes);
    }

    public static String getLongestPalindromesFromInput(String input) {
        String palindromeList = getPalindromeList(input);
        return getLongestPalindromes(palindromeList);
    }

    public static boolean isPalindrome(String word) {
        if (word == null || word.length() < 3) {
            return false;
        }
        String lowerCaseWord = word.toLowerCase();
        String reversedLowerCaseWord = new StringBuilder(lowerCaseWord).reverse().toString();
        return lowerCaseWord.equals(reversedLowerCaseWord);
    }

    public static String getPalindromeList(String input) {
        String lowercaseStringWithOnlyAlphabetical = removeSpecialCharacters(input).toLowerCase();
        String[] listOfWords = lowercaseStringWithOnlyAlphabetical.split("\\s+");
        StringBuilder wordsThatArePalindrome = new StringBuilder();
        for (String word : listOfWords) {
            if (isPalindrome(word)) {
                wordsThatArePalindrome.append(word).append(" ");
            }
        }
        return wordsThatArePalindrome.toString().trim();
    }

    public static String getLongestPalindromes(String input) {
        String[] listOfPalindromes = input.split("\\s+");
        String longestPalindrome = "";
        Set<String> palindromeSet = new LinkedHashSet<>();

        for (String word : listOfPalindromes) {
            if (word.length() > longestPalindrome.length()) {
                longestPalindrome = word;
                palindromeSet.clear();
                palindromeSet.add(word);

            } else if (word.length() == longestPalindrome.length()) {
                palindromeSet.add(word);

            }
        }
        return String.join(" ", palindromeSet);
    }


    public static String removeSpecialCharacters(String input) {
        return input.replaceAll("[^a-zA-Z\\s]", "");
    }
}

//strings can be null, strings can be empty
//no less than 3.
//    Create a method which checks if a word is a palindrome
//    A palindrome is at minimum 3 characters long and is the same for
//    The method should be case insensitive
