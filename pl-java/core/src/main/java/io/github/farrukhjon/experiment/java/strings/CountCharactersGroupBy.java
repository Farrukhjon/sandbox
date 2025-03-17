package io.github.farrukhjon.experiment.java.strings;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.Map;

public class CountCharactersGroupBy {

    public static void main(String[] args) {
        String strIn = "AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB";
        String expected = "{A=10, B=31, C=2, D=4, E=3, F=3, X=1, Y=1, Z=1}";
        String result = countNumberOfCharacters(strIn);
        assert expected.equals(result);
    }

    private static String countNumberOfCharacters(String in) {
        Map<String, Long> result = in.chars()
            .mapToObj(intCh -> (char) intCh)
            .collect(groupingBy(Object::toString, counting()));
        return result.toString();
    }


}
