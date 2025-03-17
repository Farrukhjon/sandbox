package io.github.farrukhjon.experiment.java.strings;

public class UniqueCharsOfStringImpl1 implements UniqueCharsOfString {

    @Override
    public boolean areCharsUnique(String str) {
        int length = str.length();
        int ascii = 128;
        if (length > ascii)
            return false;
        boolean[] uniqueFlag = new boolean[ascii];
        for (int i = 0; i < length; i++) {
            int charValue = str.charAt(i);
            if (uniqueFlag[charValue])
                return false;
            uniqueFlag[charValue] = true;
        }
        return true;
    }


    public static void main(String[] args) {
        UniqueCharsOfString charsOfStringImpl1 = new UniqueCharsOfStringImpl1();

        String str1 = "abcdef";

        boolean result = charsOfStringImpl1.areCharsUnique(str1);
        System.out.println(result);

        String str2 = "abcdeff";
        boolean result2 = charsOfStringImpl1.areCharsUnique(str2);
        System.out.println(result2);


    }
}
