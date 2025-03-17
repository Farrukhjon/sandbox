package io.github.farrukhjon.experiment.java.concurrency.concurrent.collections.map;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CollectionsTest {

    @Test
    public void createEmptyImmutableCollections() {
        //given:
        List<Object> emptyImmutableList = Collections.emptyList(); // Type Unsafe (Raw) version is: Collections.EMPTY_LIST

        Set<Object> emptyImmutableSet = Collections.emptySet(); // Type Unsafe (Raw) version is: Collections.EMPTY_SET

        //when:
        assertThrows(UnsupportedOperationException.class, () -> {
            emptyImmutableList.add(new Object());
            emptyImmutableSet.add(new Object());
        });
    }
}
