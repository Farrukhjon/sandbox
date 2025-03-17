package io.github.farrukhjon.experiment.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@PropertySource("classpath:persons.properties")
@Component
public class GreetingService {

    @Autowired
    private Environment environment;

    public String getGreeting(String person) {
        return environment.getProperty(person);
    }

}
