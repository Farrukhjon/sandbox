package io.github.farrukhjon.experiment.junit5.parametrization;

import io.github.farrukhjon.experiment.junit5.model.Person;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.aggregator.ArgumentsAggregationException;
import org.junit.jupiter.params.aggregator.ArgumentsAggregator;

public class PersonAggregator implements ArgumentsAggregator {

  @Override
  public Object aggregateArguments(ArgumentsAccessor accessor, ParameterContext context)
      throws ArgumentsAggregationException {
    return Person.builder()
        .firstName(accessor.getString(1))
        .middleName(accessor.getString(2))
        .lastName(accessor.getString(3))
        .build();
  }
}