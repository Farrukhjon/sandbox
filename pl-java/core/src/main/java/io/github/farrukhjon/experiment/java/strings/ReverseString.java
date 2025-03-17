package io.github.farrukhjon.experiment.java.strings;



public class ReverseString {

    public static void main(String[] args) {
        String greeting = "Hello world";

        String reversedIteratively = reverseIteratively(greeting);
        System.out.println(reversedIteratively);

        String reversedRecursively = reverseRecursively(greeting);
        System.out.println(reversedRecursively);
    }

    private static String reverseIteratively(String str) {
        StringBuilder strBuilder = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            strBuilder.append(chars[i]);
        }
        return strBuilder.toString();
    }

    private static String reverseRecursively(String str) {
        if (str.length() < 2)
            return str;
        return reverseRecursively(str.substring(1)) + str.charAt(0);
    }

}
