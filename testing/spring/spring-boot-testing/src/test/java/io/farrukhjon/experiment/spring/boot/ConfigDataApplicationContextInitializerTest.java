package io.github.farrukhjon.experiment.spring.boot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.ConfigDataApplicationContextInitializer;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * ConfigDataApplicationContextInitializer is an ApplicationContextInitializer that you can apply to your tests to load Spring Boot application-test.properties files.
 * You can use it when you do not need the full set of features provided by @SpringBootTest.
 * Note that using ConfigDataApplicationContextInitializer alone does not provide support for @Value("${…}") injection.
 * Its only job is to ensure that application-test.properties files are loaded into Spring’s Environment.
 * For @Value support, you need to either additionally configure a PropertySourcesPlaceholderConfigurer or use @SpringBootTest,
 * which auto-configures one for you.
 */

@ActiveProfiles(profiles = "test")
@SpringJUnitConfig(classes = MyContextConfiguration.class, initializers = ConfigDataApplicationContextInitializer.class)
class ConfigDataApplicationContextInitializerTest {

    @Autowired
    private Environment environment;

    @Test
    void testCheckIfContentOfApplicationPropertiesHasLoaded() {
        Assertions.assertNotNull(environment);
        //loads from application-test.properties activated by "test" profile.
        Assertions.assertEquals("test", environment.getProperty("test.prop"));
    }
}
