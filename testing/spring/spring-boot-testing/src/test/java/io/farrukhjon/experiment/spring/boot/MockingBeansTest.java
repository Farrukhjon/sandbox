package io.github.farrukhjon.experiment.spring.boot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest(classes = MyContextConfiguration.class, properties = "my.feature1.enabled=true")
class MockingBeansTest {

    @MockBean
    private DataProvider dataProvider;

    @Autowired
    private ClientCodeBean clientCodeBean;

    private final String testData = "Data provided from simpleDataProvider";

    @BeforeEach
    void setUp() {
        Mockito.when(dataProvider.getData()).thenReturn(testData);
    }

    @Test
    void testGetProcessedData() {
        Assertions.assertEquals(testData + " has been processed", clientCodeBean.getProcessedData());
    }
}
