package io.github.farrukhjon.experiment.java.metaprogrammingandreflection.annotation.inherited;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface TestAnnotation {
    String[] value();
}

@TestAnnotation("Alert")
interface TestInterfaceAnnotated {
}

@TestAnnotation("Alert")
class TestClassAnnotated {
}

class ClassImplements implements TestInterfaceAnnotated {
}

class ClassExtends extends TestClassAnnotated {
}

public class InheritanceDemo {
    public static void main(String[] args) {

        TestInterfaceAnnotated ti = new ClassImplements();
        System.out.println(ti.getClass().getAnnotation(TestAnnotation.class));
        //null

        TestClassAnnotated tc = new ClassExtends();
        System.out.println(tc.getClass().getAnnotation(TestAnnotation.class));
        //@io.github.farrukhjon.experiment.java.annotation.inherited.TestAnnotation({"Alert"})
    }
}
