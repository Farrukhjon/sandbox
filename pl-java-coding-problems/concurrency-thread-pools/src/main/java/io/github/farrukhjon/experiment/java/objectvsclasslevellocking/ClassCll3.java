package io.github.farrukhjon.experiment.java.objectvsclasslevellocking;

public class ClassCll3 {

    private final static Object aLock = new Object();

    public void method() {
        synchronized (aLock) {
            System.out.println("This is an CLL example");
        }
    }
}
