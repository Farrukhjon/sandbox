package io.github.farrukhjon.experiment.java.collection;

import io.github.farrukhjon.experiment.java.domain.Person;
import io.github.farrukhjon.experiment.java.methodRefernce.MethodReferenceExample;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

/**
 * Created by Farrukhjon on 08-Oct-15.
 */
public class MethodReferenceExampleTest {

    @Test
    public void testSortPersonByBirthDateUsingMethodReference() {
        MethodReferenceExample sut = new MethodReferenceExample();

        Person[] persons = new Person[]{
                new Person("Ali", LocalDate.of(1984, 10, 10)),
                new Person("Vali", LocalDate.of(1980, 7, 1)),
                new Person("Surayo", LocalDate.of(1989, 1, 10))};

        Person[] expectedPersons = new Person[]{
                new Person("Vali", LocalDate.of(1980, 7, 1)),
                new Person("Ali", LocalDate.of(1984, 10, 10)),
                new Person("Surayo", LocalDate.of(1989, 1, 10))};

        sut.sortPersonByItsBirthDateUsingMethodReference(persons);

        Assert.assertArrayEquals(expectedPersons, persons);
    }
}
