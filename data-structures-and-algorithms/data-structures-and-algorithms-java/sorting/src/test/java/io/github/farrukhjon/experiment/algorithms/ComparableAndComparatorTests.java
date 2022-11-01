package io.github.farrukhjon.experiment.algorithms;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ComparableAndComparatorTests {

    private List<String> names = null;
    private List<Person> persons = null;

    @BeforeEach
    public void setUp() {
        names = Arrays.asList("Ali", "Vali", "Surayo", "Myhayo");
        persons = Arrays.asList(new Person("Ali", "Samizoda"), new Person("Jomi", "Ganioda"), new Person("Vali", "Hasanzoda"));
    }

    @Test
    public void shouldTestSortingStringByLengthOrderingUsingComparator() {
        Comparator<String> stringByLengthComparator = (name1, name2) -> name2.length() - name1.length();
        Collections.sort(names, stringByLengthComparator);
        String[] expectedNames = new String[]{"Surayo", "Myhayo", "Vali", "Ali"};
        assertArrayEquals(expectedNames, names.toArray());
    }

    @Test
    void shouldTestSortingPersonsByTheirFirstNames() {
        System.out.println(persons);
        Collections.sort(persons);
        System.out.println(persons);
    }

    static class Person implements Comparable<Person> {
        private final String firstName;

        private final String lastName;

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        @Override
        public int compareTo(final Person o) {
            return o.firstName.hashCode() - this.firstName.hashCode();
        }

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("{");
            sb.append("firstName='").append(firstName).append('\'');
            sb.append(", lastName='").append(lastName).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

}
