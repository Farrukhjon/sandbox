package io.github.farrukhjon.experiment.spring.boot;

import java.util.concurrent.TimeUnit;

public class SimpleDataProvider implements DataProvider {

    public SimpleDataProvider() {
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getData() {
        return "simpleData";
    }

}
