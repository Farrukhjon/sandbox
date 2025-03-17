package io.github.farrukhjon.experiment.groovy.map

class MapCollectValues {

    static void main(String[] args) {
        def personsNameToAges = ['Ali': ['age': 32], 'Vali': ['age': 22], 'Sami': ['age': 22], 'Gani': ['age': 22]]

        def ages = personsNameToAges.values().collect {it -> it.age }

        println(ages)
    }

}
