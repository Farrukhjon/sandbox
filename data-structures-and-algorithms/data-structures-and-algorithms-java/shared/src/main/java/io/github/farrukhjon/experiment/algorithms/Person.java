package io.github.farrukhjon.experiment.algorithms;

public class Person {

	private final int	id;

	public Person(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "person" + id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id;
	}

	public int getId() {
		return id;
	}

}
