package io.github.farrukhjon.experiment.java.dp.behavioral.memento.solution3;

public class IntAdder {

	private Integer	dataState;

	public Integer getDataState() {
		return dataState;
	}

	public void setDataState(Integer dataState) {
		this.dataState = dataState;
	}

	public IntMemento save() {
		return new IntMemento(dataState);
	}

	public void restore(IntMemento memento) {
		dataState = memento.getData();
	}

	@Override
	public String toString() {
		return String.valueOf(dataState);
	}
}
