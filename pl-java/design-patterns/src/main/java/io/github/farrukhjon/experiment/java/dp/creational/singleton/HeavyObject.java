package io.github.farrukhjon.experiment.java.dp.creational.singleton;

public class HeavyObject {

    private static HeavyObject instance;

    public static HeavyObject getInstance() {
        return instance == null ? new HeavyObject() : instance;
    }

}
