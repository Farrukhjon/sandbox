package io.github.farrukhjon.experiment.java.concurrency.atomicity

import io.github.farrukhjon.experiment.java.java.concurrency.atomicity.CounterAtomic
import spock.lang.Specification

class CounterAtomicTest extends Specification {

    def 'should increment and get number'() {
        given:
        def sut = new CounterAtomic()

        when:
        10.times {
            new Thread(new Runnable() {
                @Override
                void run() {
                    sut.incrementNumber();
                    println Thread.currentThread().getName()
                }
            }).start()
        }

        then:
        sut.getNumber() == 10
    }
}
