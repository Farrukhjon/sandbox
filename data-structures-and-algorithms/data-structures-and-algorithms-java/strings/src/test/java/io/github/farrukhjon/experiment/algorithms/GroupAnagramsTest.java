package io.github.farrukhjon.experiment.algorithms;


import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GroupAnagramsTest {

    private GroupAnagramsSolution1 sut;

    @BeforeEach
    public void setUp() {
        sut = new GroupAnagramsSolution1();
    }

    @Test
    void testGroupingAnagram() {
        String[] words = {"cat", "act", "book", "koob", "Aziza"};
        Collection<List<String>> groupedAnagrams = sut.groupAnagrams(words);

        Set<List<String>> expectedAGroup = createExpectedAnagramGroup();
    }

    private Set<List<String>> createExpectedAnagramGroup() {
        HashSet<List<String>> group = new HashSet<>();
        group.add(Arrays.asList("cat", "act"));
        group.add(Arrays.asList("book", "koob"));
        group.add(Arrays.asList("Aziza"));
        return group;
    }
}
