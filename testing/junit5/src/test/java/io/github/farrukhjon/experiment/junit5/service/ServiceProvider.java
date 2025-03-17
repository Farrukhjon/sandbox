package io.github.farrukhjon.experiment.junit5.service;

public interface ServiceProvider<T> {

  T findName(String aName);

}
