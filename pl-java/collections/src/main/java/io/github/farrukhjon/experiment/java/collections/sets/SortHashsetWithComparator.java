package io.github.farrukhjon.experiment.java.collections.sets;

import io.github.farrukhjon.experiment.java.model.Person;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortHashsetWithComparator {

	public static void main(String[] args) {

		Set<Person> unsortedSet = new HashSet<>();
		unsortedSet.add(new Person(4));
		unsortedSet.add(new Person(2));
		unsortedSet.add(new Person(3));
		unsortedSet.add(new Person(1));
		unsortedSet.add(new Person(4));
		unsortedSet.add(new Person(1));
		unsortedSet.add(new Person(5));

		System.out.println(unsortedSet);

		Set<Person> sortedSet = new TreeSet<>(new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return (o1.id() < o2.id()) ? -1 : (o1.id() > o2.id()) ? 1 : 0;
			}
		});
		sortedSet.addAll(unsortedSet);

		System.out.println(sortedSet);

		Set<PersonComparable> unsortedSet2 = new HashSet<>();
		unsortedSet2.add(new PersonComparable(1));
		unsortedSet2.add(new PersonComparable(3));
		unsortedSet2.add(new PersonComparable(2));
		unsortedSet2.add(new PersonComparable(5));
		unsortedSet2.add(new PersonComparable(4));
		System.out.println(unsortedSet2);

		Set<PersonComparable> sortedSet2 = new TreeSet<>(unsortedSet2);
		System.out.println(sortedSet2);
	}

}
