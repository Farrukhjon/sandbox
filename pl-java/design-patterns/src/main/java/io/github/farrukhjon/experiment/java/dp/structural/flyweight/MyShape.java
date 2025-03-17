package io.github.farrukhjon.experiment.java.dp.structural.flyweight;

import java.awt.Color;
import java.awt.Graphics;

public interface MyShape {

	public void draw(Graphics g, int x, int y, int width, int height, Color color, boolean fill, String font);

}
