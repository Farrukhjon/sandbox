package org.farrukh.examples.java.concurrency.atomicity

import atomicity.AtomicCounter
import spock.lang.Specification

class CounterAtomicTest extends Specification {

    def 'should increment and get number'() {
        given:
        def sut = new AtomicCounter()

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
