package io.github.farrukhjon.experiment.java.oop;

import org.junit.jupiter.api.Test;

/**
 * @author fsattorov
 */
public class PassByTest {

    @Test
    void testPassByValue() {
        Foo foo1 = new Foo();
        System.out.println(foo1);
        Foo foo1New = doStuff(foo1);
        System.out.println(foo1New);
        System.out.println(foo1);
    }

    @Test
    void testPassPrimitiveType() {
        int a = 1;
        System.out.printf("Before modify a = %s\n", a);
        modify(a);
        System.out.printf("After modify a = %s\n", a);

        // Before modify a = 1
        // a = 2
        // After modify a = 1
    }

    private void modify(int a) {
        a = a + 1;
        System.out.printf("a = %s\n", a);
    }

    private Foo doStuff(Foo foo1) {
        foo1 = new Foo();
        return foo1;
    }
}
