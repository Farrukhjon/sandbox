package io.github.farrukhjon.experiment.java.concurrency

import io.github.farrukhjon.experiment.java.concurrency.thread.ThreadExtendsExample
import spock.lang.Specification

/**
 * Created by Farrukhjon on 20-Sep-15.
 */
class CreatingAndRunningThreadsTest extends  Specification {

    def 'exercise creating a thread by extending from Thread class'() {

        when:
        ThreadExtendsExample extendsExample = new ThreadExtendsExample()

        then:
        extendsExample instanceof Thread

    }
}
