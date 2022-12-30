package io.github.farrukhjon.experiment;

import org.springframework.boot.test.TestRestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestOperations;

@Configuration
public class IntegrationTestsConfig {

    @Bean
    public RestOperations restTemplate() {
        return new TestRestTemplate();
    }

}
