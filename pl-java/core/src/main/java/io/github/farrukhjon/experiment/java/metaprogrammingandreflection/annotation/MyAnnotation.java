package io.github.farrukhjon.experiment.java.metaprogrammingandreflection.annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
public @interface MyAnnotation {

    String value() default "";

    String message() default "value must not be null";
}
