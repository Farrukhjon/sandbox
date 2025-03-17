package io.github.farrukhjon.experiment.junit5.extension;

import io.github.farrukhjon.experiment.junit5.parametrization.PersonAggregator;
import io.github.farrukhjon.experiment.junit5.model.Person;
import io.github.farrukhjon.experiment.junit5.service.PersonArgumentsProviderImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.AggregateWith;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

class ListOfNamesParameterResolverTest {

  @ParameterizedTest
  @ArgumentsSource(PersonArgumentsProviderImpl.class)
  void testPersonsProvidedByArgumentsProvider(Person person) {
    Assertions.assertNotNull(person);
  }

  @ParameterizedTest
  @CsvSource({"Isaac,,Newton,Isaac Newton", "Charles,Robert,Darwin,Charles Robert Darwin"})
  void testPersonsProvidedByArgumentsAccessor(ArgumentsAccessor argumentsAccessor) {
    String firstName = argumentsAccessor.getString(0);
    String middleName = (String) argumentsAccessor.get(1);
    String lastName = argumentsAccessor.get(2, String.class);
    String expectedFullName = argumentsAccessor.getString(3);

    Person person = Person.builder()
        .firstName(firstName)
        .middleName(middleName)
        .lastName(lastName)
        .build();
    Assertions.assertEquals(expectedFullName, person.fullName());
  }

  @ParameterizedTest
  @CsvSource({"Isaac Newton,Isaac,,Newton", "Charles Robert Darwin,Charles,Robert,Darwin"})
  void testPersonsProvidedByArgumentsAggregator(String expectedFullName, @AggregateWith(PersonAggregator.class) Person person) {
    Assertions.assertEquals(expectedFullName, person.fullName());
  }

  @ParameterizedTest
  @CsvFileSource(resources = {"persons.csv"})
  void testPersonsProvidedByArgumentsAggregatorCsvFile(@AggregateWith(PersonAggregator.class) Person person) {
    Assertions.assertNotNull(person.fullName());
  }

}
