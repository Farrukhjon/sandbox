package io.github.farrukhjon.experiment.java.collections.hashmap;

public interface HashTable<K, V> {

    int hashFunction();

    void add(K key, V value);

    V getValue(K key);

}
