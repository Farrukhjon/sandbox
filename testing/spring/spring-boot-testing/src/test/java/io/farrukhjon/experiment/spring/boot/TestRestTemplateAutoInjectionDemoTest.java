package io.github.farrukhjon.experiment.spring.boot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class TestRestTemplateAutoInjectionDemoTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    void shouldBeCreatedAsABeanAndInjected() {
        assertNotNull(testRestTemplate);
    }

}
