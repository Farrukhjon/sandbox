package io.github.farrukhjon.experiment.junit5.service;

import io.github.farrukhjon.experiment.junit5.model.Person;
import java.util.stream.Stream;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public class PersonArgumentsProviderImpl implements ArgumentsProvider {

  @Override
  public Stream<? extends Arguments> provideArguments(final ExtensionContext extensionContext) throws Exception {
    return Stream.of("Ali", "Vali", "Sami")
        .map(name -> Arguments.of(Person.builder()
            .firstName(name)
            .build()));
  }
}
