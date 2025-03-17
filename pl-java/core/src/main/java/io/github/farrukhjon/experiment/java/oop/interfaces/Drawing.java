package io.github.farrukhjon.experiment.java.oop.interfaces;

public class Drawing {
	private Shape	shape;

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public void drawShape() {
		this.shape.draw();
	}
}
