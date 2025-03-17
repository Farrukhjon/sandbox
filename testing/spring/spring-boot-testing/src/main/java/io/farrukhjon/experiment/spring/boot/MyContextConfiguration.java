package io.github.farrukhjon.experiment.spring.boot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyContextConfiguration {

    @Bean
    @ConditionalOnProperty(name = "my.feature1.enabled", havingValue = "true")
    public DataProvider dataProvider() {
        return new SimpleDataProvider();
    }

    @Bean
    @ConditionalOnProperty(name = "my.feature1.enabled", havingValue = "false")
    public DataProvider complexDataProvider() {
        return new ComplexDataProvider();
    }

    @Bean
    public ClientCodeBean clientCodeBean(DataProvider dataProvider) {
        return new ClientCodeBean(dataProvider);
    }

}
