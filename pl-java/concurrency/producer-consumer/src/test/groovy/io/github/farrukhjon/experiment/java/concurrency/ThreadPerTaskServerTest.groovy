package io.github.farrukhjon.experiment.java.concurrency

import io.github.farrukhjon.experiment.java.java.concurrency.thread.ThreadPerTaskServerExample
import spock.lang.Specification

/**
 * Created by Farrukhjon on 19-Sep-15.
 */
class ThreadPerTaskServerTest extends Specification {

    def 'exercise thread per task server'() {
        given: 'subject under test is created'
        def serverExample = new ThreadPerTaskServerExample();
        when:
        serverExample.run();

        and: 'socket client is created'
        Socket client = new Socket()
        client.connect(new InetSocketAddress(1010))

        and:
        String data = "Hello world!";
        OutputStream out = new BufferedOutputStream(System.out)
        out.write(data.bytes)
        client.outputStream = out

        then:
        true
    }
}
