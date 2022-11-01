package io.github.farrukhjon.experiment.algorithms;

public class MyObj {

	private final int	id;

	public MyObj(int id) {
		super();
		this.id = id;
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
		MyObj other = (MyObj) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return String.valueOf(id);
	}

	public static void main(String[] args) {
		MyObj obj1 = new MyObj(1);
		MyObj obj2 = new MyObj(2);
		MyObj obj3 = new MyObj(3);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());

	}

}
