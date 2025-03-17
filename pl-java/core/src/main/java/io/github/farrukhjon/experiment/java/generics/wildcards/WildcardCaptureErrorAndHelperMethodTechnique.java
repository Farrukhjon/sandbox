package io.github.farrukhjon.experiment.java.generics.wildcards;

import java.util.Arrays;
import java.util.List;

public class WildcardCaptureErrorAndHelperMethodTechnique {

    public static void main(String[] args) {
        foo(Arrays.asList("A", "B", "C"));
        foo(Arrays.asList(1, 2, 3));
        foo(Arrays.asList(10.1, 100.22, 3.14));
    }

    // Wildcard capture error - is to enforce type safety at compile time.
    //static void foo(List<?> aWildcardList) {
    //    final Object anObjInstance = aWildcardList.get(0);
    //    aWildcardList.set(0, anObjInstance); // java: incompatible types: java.lang.Object cannot be converted to capture#1 of ?
    //}

    static void foo(List<?> aWildcardList) {
        fooHelper(aWildcardList);
    }

    // Helper method created so that the wildcard can be captured through type inference.
    private static <T> void fooHelper(final List<T> aGenericList) {
        final T anProperTypeInstance = aGenericList.get(0);
        aGenericList.set(0, anProperTypeInstance);
    }

}
