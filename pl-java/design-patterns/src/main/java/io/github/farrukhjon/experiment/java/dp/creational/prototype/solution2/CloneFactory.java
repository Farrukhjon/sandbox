package io.github.farrukhjon.experiment.java.dp.creational.prototype.solution2;

public class CloneFactory {

	public Animal getClone(Animal simpleAnimal) {
		return simpleAnimal.makeCopy();
	}

}
