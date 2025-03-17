package io.github.farrukhjon.experiment.java.latches;

import io.github.farrukhjon.experiment.java.barrier.ServerInstance;

public class Main {

    public static void main(String[] args) {

        System.setProperty("java.util.logging.SimpleFormatter.format",
                "[%1$tT] [%4$-7s] %5$s %n");

        Thread server = new Thread(new ServerInstance());
        server.start();
    }

}
