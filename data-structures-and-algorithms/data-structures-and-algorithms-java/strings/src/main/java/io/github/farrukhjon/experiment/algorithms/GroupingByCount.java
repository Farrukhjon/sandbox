package io.github.farrukhjon.experiment.algorithms;

public class GroupingByCount {

    public static void main(String[] args) {
        String strIn = "AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB";
        String expected = "A4B3C2XYZD4E3F3A6B28";
        String result = rle(strIn);
        assert expected.equals(result);
    }

    private static String rle(String in) {
        StringBuilder sb = new StringBuilder();
        char[] chars = in.toCharArray();
        int count = 1;
        int i = 0;
        int j = 0;
        while (i < chars.length) {
            if (j == chars.length - 1) {
                sb.append(chars[i]).append(count);
                break;
            }
            if (chars[i] == chars[++j]) {
                count++;
                continue;
            } else {
                sb.append(chars[i]);
                if (count > 1)
                    sb.append(count);
                count = 1;
            }
            i = j;
        }
        return sb.toString();
    }
}
