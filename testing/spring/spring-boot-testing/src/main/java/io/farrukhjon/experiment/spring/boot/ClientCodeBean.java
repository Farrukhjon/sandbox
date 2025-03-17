package io.github.farrukhjon.experiment.spring.boot;

public class ClientCodeBean {

    private final DataProvider dataProvider;

    public ClientCodeBean(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }

    public String getProcessedData() {
        return this.dataProvider.getData() + " has been processed";
    }

}
