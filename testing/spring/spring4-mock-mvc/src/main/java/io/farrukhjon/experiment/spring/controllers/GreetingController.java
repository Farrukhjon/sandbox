package io.github.farrukhjon.experiment.spring.controllers;

import io.github.farrukhjon.experiment.spring.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping(value = "/greeting/{person}")
    public ResponseEntity<String> greeting(@PathVariable String person) {
        String greeting = greetingService.getGreeting(person);
        return ResponseEntity.ok(greeting);
    }

}
