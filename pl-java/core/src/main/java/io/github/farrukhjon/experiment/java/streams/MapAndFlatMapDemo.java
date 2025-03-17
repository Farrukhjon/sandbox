package io.github.farrukhjon.experiment.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAndFlatMapDemo {

    public static void main(String[] args) {
        Function<String, List<Character>> funcStrToCharList = str -> {
            char[] chars = str.toCharArray();
            List<Character> characterList = new ArrayList<>();
            for (char aChar : chars) {
                characterList.add(aChar);
            }
            return characterList;
        };

        List<String> nameList = Arrays.asList("Ali", "Vali", "Sami");

        List<List<Character>> listList = nameList
                .stream()
                .map(funcStrToCharList)
                .flatMap(Stream::of)
                .collect(Collectors.toList());
        System.out.println(listList);

    }

}
