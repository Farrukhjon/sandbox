package io.github.farrukhjon.experiment.java.objectvsclasslevellocking;

public class ClassOll3 {

    private final Object ollLock = new Object();

    public void methodOll() {
        synchronized (ollLock) {
            System.out.println("This is an OLL example");
        }
    }

}
