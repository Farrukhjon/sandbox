package io.github.farrukhjon.experiment.junit5.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class Person {

  private String firstName;
  private String middleName;
  private String lastName;

  public String fullName() {
    if (middleName == null || middleName.trim().isEmpty()) {
      return String.format("%s %s", firstName, lastName);
    }
    return String.format("%s %s %s", firstName, middleName, lastName);
  }

}
