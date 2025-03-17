package io.github.farrukhjon.experiment.java.dp.structural.composite.solution1;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements IGraphic {

    private List<IGraphic> childGraphics = new ArrayList<>();

    public void add(IGraphic iGraphic) {
        childGraphics.add(iGraphic);
    }

    @Override
    public void print() {
        for (IGraphic iGraphic : childGraphics) {
            iGraphic.print();
        }
    }

    public void remove(IGraphic iGraphic) {
        childGraphics.remove(iGraphic);
    }
}
