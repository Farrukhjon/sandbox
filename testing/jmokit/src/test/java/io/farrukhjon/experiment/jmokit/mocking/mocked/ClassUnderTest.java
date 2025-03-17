package io.github.farrukhjon.experiment.jmokit.mocking.mocked;

public class ClassUnderTest {
    
    private C c;
    
    public ClassUnderTest(C c) {
        this.c = c;
    }

    public String greeting() {
        return c.sayHello() + " world!";
    }
    
}
