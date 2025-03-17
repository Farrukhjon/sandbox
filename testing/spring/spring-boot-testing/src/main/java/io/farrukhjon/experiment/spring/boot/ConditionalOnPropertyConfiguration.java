package io.github.farrukhjon.experiment.spring.boot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionalOnPropertyConfiguration {

    @Bean(name = "greetingRuBean")
    @ConditionalOnProperty(name = "app.greeting.lang", havingValue = "RU", matchIfMissing = true)
    public String greetingRu() {
        return "Privet!";
    }

    @Bean(name = "greetingEnBean")
    @ConditionalOnProperty(name = "app.greeting.lang", havingValue = "EN", matchIfMissing = false)
    public String greetingEn() {
        return "Hello!";
    }

}
