package io.github.farrukhjon.experiment.java.objectvsclasslevellocking;

public class ClassOll2 {

    public void methodOll() {
        synchronized (this) {
            System.out.println("This is an OLL example");
        }
    }
}
