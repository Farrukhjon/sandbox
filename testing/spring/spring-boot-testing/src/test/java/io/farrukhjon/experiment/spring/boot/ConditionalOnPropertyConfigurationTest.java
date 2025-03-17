package io.github.farrukhjon.experiment.spring.boot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.assertj.AssertableApplicationContext;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

class ConditionalOnPropertyConfigurationTest {

    private ApplicationContextRunner contextRunner;

    @BeforeEach
    void setUp() {
        this.contextRunner = new ApplicationContextRunner();
    }

    @Test
    void testGreetingRuMatchIfMissing() {
        this.contextRunner
                .withUserConfiguration(ConditionalOnPropertyConfiguration.class)
                .run((AssertableApplicationContext context) -> {
                    String greetingRuBean = (String) context.getBean("greetingRuBean");
                    Assertions.assertThat(greetingRuBean).isEqualTo("Privet!");
                    Assertions.assertThat(context).doesNotHaveBean("greetingEnBean");
                });
    }

    @Test
    void testGreetingRu() {
        this.contextRunner
                .withUserConfiguration(ConditionalOnPropertyConfiguration.class)
                .withPropertyValues("app.greeting.lang=ru")
                .run((AssertableApplicationContext context) -> {
                    String greetingRuBean = (String) context.getBean("greetingRuBean");
                    Assertions.assertThat(greetingRuBean).isEqualTo("Privet!");
                    Assertions.assertThat(context).doesNotHaveBean("greetingEnBean");
                });
    }

    @Test
    void testGreetingEn() {
        this.contextRunner
                .withUserConfiguration(ConditionalOnPropertyConfiguration.class)
                .withPropertyValues("app.greeting.lang=EN")
                .run((AssertableApplicationContext context) -> {
                    String greetingEnBean = (String) context.getBean("greetingEnBean");
                    Assertions.assertThat(greetingEnBean).isEqualTo("Hello!");
                    Assertions.assertThat(context).doesNotHaveBean("greetingRuBean");
                });
    }

}
