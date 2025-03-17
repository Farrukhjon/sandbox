package io.github.farrukhjon.experiment.groovy.map

class MapFlatten {

    static void main(String[] args) {
        def personsNameToAges = ['Ali': ['age': 32], 'Vali': ['age': 22]]

        def ages = personsNameToAges.values().collect { it -> it.keySet() }.flatten().unique()

        println(ages)
    }

}
