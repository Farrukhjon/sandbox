package io.github.farrukhjon.experiment.groovy.list

class ListOperations {

    static void main(String[] args) {
        def aListOfNumbers = [0, 1, 2, 3, 4]
        assert [0, 2, 4, 6, 8] == aListOfNumbers.collect { it * 2 }
    }

}
