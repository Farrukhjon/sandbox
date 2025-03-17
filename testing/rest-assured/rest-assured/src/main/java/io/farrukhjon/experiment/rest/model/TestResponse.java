package io.github.farrukhjon.experiment.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TestResponse {

    @JsonProperty
    private String payload;

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }
}
