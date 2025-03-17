package io.github.farrukhjon.experiment.java.collection;

import io.github.farrukhjon.experiment.java.model.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class CollectToMapByApplyingMergeFunctionTest {

    @Test
    public void testMergerFaction() {
        List<Person> persons = createPersons();
        Comparator<? super String> comparator = Comparator.naturalOrder();
        Objects.requireNonNull(comparator);
        Map<String, String> mappedFirstNameLastName = persons.stream()
                .collect(Collectors.toMap(Person::firstName, Person::lastName));
        Assert.assertFalse(mappedFirstNameLastName.isEmpty());
        Set<Object> set = new HashSet<>();
        set.contains(null);
    }

    private List<Person> createPersons() {
        return List.of(
                new Person("Ali", "Ganiev"),
                new Person("Smai", "Ganiev"),
                new Person("Vali", "Ganiev")
        );
    }
}
