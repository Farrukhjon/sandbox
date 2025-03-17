package io.github.farrukhjon.experiment.java.stampedlock.tryconverttowritelock;

public class Main {

    public static void main(String[] args) {

        ConvertToWriteLock convertToWriteLock = new ConvertToWriteLock();
        convertToWriteLock.withdraw(500);
    }
}
