package io.github.farrukhjon.tdd.experiment;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = ComboPooledEmbeddedH2Database.class)
class ComboPooledEmbeddedH2DatabaseTest {

    @Autowired
    private DataSource dataSource;

    @Test
    void testPooledEmbeddedDatabase() {
        Assertions.assertNotNull(dataSource);
        Assertions.assertTrue(dataSource instanceof ComboPooledDataSource);
    }
}
