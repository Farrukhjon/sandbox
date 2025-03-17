package io.github.farrukhjon.experiment.java.methodRefernce;

import io.github.farrukhjon.experiment.java.domain.Person;

import static java.util.Arrays.sort;

/**
 * Created by Farrukhjon on 18-Sep-15.
 */
public class MethodReferenceExample {

    public void sortPersonByItsBirthDateUsingMethodReference(Person[] persons) {
        sort(persons, Person::compareByBirthDate);
    }

}
