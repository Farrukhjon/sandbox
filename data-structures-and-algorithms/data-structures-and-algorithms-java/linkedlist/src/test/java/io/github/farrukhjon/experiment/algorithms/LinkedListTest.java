package io.github.farrukhjon.experiment.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class LinkedListTest {

    private final String PREFIX = "NAMES:";

    @Test
    void testPeekLastAddLastItem() {
        //given:
        String commaSeparatedNames = "/Ali/Vali/Sami/Gani";

        //when:
        LinkedList<String> generatedList = new LinkedList<>();
        Arrays.stream(commaSeparatedNames.split("/"))
                .filter(name -> !name.isBlank())
                .forEach(name -> {
                    String lastItem = generatedList.peekLast();
                    if (lastItem != null) {
                        generatedList.addLast(lastItem + "-" + name);
                    } else {
                        generatedList.addLast(PREFIX + "-" + name);
                    }
                });
        //then:
        List<String> expectedList = List.of("NAMES:-Ali", "NAMES:-Ali-Vali", "NAMES:-Ali-Vali-Sami", "NAMES:-Ali-Vali-Sami-Gani");
        Assertions.assertEquals(expectedList, generatedList);
    }
}
