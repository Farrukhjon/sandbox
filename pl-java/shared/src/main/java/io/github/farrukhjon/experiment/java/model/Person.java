package io.github.farrukhjon.experiment.java.model;

public record Person(int id, String firstName, String lastName) {

	public Person(int id) {
		this(id, "", "");
	}

	public Person(String firstName, String lastName) {
		this(0, firstName, lastName);
	}

	@Override
	public String toString() {
		return "person" + id;
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


}
