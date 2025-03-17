package io.github.farrukhjon.experiment.spring.boot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.assertj.AssertableApplicationContext;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

class ApplicationContextRunnerTest {

    private ApplicationContextRunner contextRunner;

    @BeforeEach
    void setUp() {
        this.contextRunner = new ApplicationContextRunner();
    }

    @Test
    void testContextRunner() {
        this.contextRunner
                .withUserConfiguration(MyContextConfiguration.class)
                .run((AssertableApplicationContext context) -> {
                    Assertions.assertThat(context).doesNotHaveBean(String.class);
                });
    }


}
