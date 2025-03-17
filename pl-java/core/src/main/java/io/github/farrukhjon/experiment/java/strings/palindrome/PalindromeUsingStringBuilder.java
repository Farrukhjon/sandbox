package io.github.farrukhjon.experiment.java.strings.palindrome;


public class PalindromeUsingStringBuilder {

    public boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return reversed.equals(str);
    }

}
