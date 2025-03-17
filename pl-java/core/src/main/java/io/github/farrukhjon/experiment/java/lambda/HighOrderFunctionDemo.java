

package io.github.farrukhjon.experiment.java.lambda;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * High-Order Function:
 *  - Function that takes function(s) as argument(s);
 *  - Function that returned as result of other function;
 *  - Function that returns a function as its result.
 */

public class HighOrderFunctionDemo {

    public static void main(String[] args) {
        String firstPart = "Hello";
        String secondPart = "World";

        Supplier<String> binder = concat(firstPart, secondPart);
        Function<String, String> transformer = transform();

        String result = concatAndTransform(binder, transformer);

        assert "HELLO WORLD".equals(result);
    }

    private static Supplier<String> concat(String str1, String str2) {
        //Supplier<String> concatSupplier = () -> String.join(" ", str1, str2);
        // Shortcut is:
        return () -> String.join(" ", str1, str2);
    }

    private static Function<String, String> transform() {
        //Function<String, String> toUpperCaseFunction = String::toUpperCase;
        return String::toUpperCase;
    }

    private static String concatAndTransform(Supplier<String> concatSupplier,
                                             Function<String, String> transformer) {
        String s = concatSupplier.get();
        return transformer.apply(s);
    }


}
