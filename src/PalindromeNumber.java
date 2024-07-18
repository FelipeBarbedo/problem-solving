/*
Given an integer x, return true if x is a palindrome,
and false otherwise.
*/

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(SolutionPN.isPalindrome(1001));
    }
}

class SolutionPN {
    public static boolean isPalindrome(int x) {
        StringBuilder word = new StringBuilder(Integer.toString(x));
        StringBuilder newWord = new StringBuilder();

        for (int i = (word.length() - 1); i >= 0; i--)
            newWord.append(word.charAt(i));

        return word.compareTo(newWord) == 0;
    }
}