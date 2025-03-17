package io.github.farrukhjon.experiment.java.collections.model;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

    public static void main(String[] args) {
        List<String> emptyImmutableList = Collections.emptyList();

        List<Integer> modifiableList = new ArrayList<>();
        modifiableList.add(1);
        modifiableList.add(2);
        modifiableList.add(3);

        List<Integer> unmodifiableList = Collections.unmodifiableList(modifiableList);

        unmodifiableList.add(4);

        System.out.println(emptyImmutableList);

    }

}
