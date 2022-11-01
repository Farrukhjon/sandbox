package io.github.farrukhjon.experiment.algorithms;

import static java.lang.System.out;

public class StringBasicOperations {

    public static void main(String[] args) {

        String str = "Hello world!";
        out.printf("str: %s %n", str);

        int lengthOfStr = str.length();
        out.printf("lengthOfStr: %d %n", lengthOfStr);

        char charAt0 = str.charAt(0);
        out.printf("charAt0: %c %n", charAt0);

        int codePointAt0 = str.codePointAt(0);
        out.printf("codePointAt0: %d %n", codePointAt0);

        String concatStrToMy = str.concat("My");
        out.printf("concatStrToMy: %s %n", concatStrToMy);

        byte[] bytesOfStr = str.getBytes();
        out.print("bytesOfStr: ");
        for (byte b : bytesOfStr) {
            out.printf("%02x", b);
        }
        out.println();

        String substring05 = str.substring(0, 5);
        out.printf("substring05: %s %n", substring05);

        CharSequence subSequence05 = str.subSequence(0, 5);
        out.printf("subSequence05: %s %n", subSequence05);
    }

}
