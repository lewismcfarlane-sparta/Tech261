# Palindrome Checker and Finder

## Overview

This project provides functionality to check for palindromes and find the longest unique palindromes in a given sentence. The implementation includes methods to clean input strings, identify palindromes, and manage the longest palindromes found.

## Features

1. **Palindrome Checker**:
    - Checks if a word is a palindrome.
    - Requirements: Minimum length of 3 characters, case insensitive, spaces are not ignored.
    - Example: "Dad" is a palindrome, "race car" is not.

2. **Longest Unique Palindrome Finder**:
    - Identifies and returns the longest unique palindromes from a sentence.
    - Ignores all non-alphabet characters.
    - Preserves the order of appearance of the palindromes.
    - If multiple palindromes have the same length, all are returned.

## Example Usage

Input: `"tree dad rAdaR l%evel! mum r0ot?oR"`

Output: `"radar level rotor"`

## Methods

- **`isPalindrome(String word)`**: Checks if a word is a palindrome.
- **`removeSpecialCharacters(String input)`**: Removes non-alphabet characters from the input.
- **`getPalindromeList(String input)`**: Extracts palindromes from a cleaned input string.
- **`getLongestPalindromes(String input)`**: Finds the longest unique palindromes from a list of palindromes.
- **`getLongestPalindromesFromInput(String input)`**: Main method to process the input and return the longest unique palindromes.

## How to Run

1. Include the provided Java code in your project.
2. Run the `main` method in the `PalindromeCheck` class with your input string.
3. The program will output the longest unique palindromes.

## Dependencies

No external dependencies are required. This program runs on standard Java libraries.
