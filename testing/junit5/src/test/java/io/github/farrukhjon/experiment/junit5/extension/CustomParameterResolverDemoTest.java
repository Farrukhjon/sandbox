package io.github.farrukhjon.experiment.junit5.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(RandomNumberExtension.class)
class CustomParameterResolverDemoTest {

  @Test
  void testByProvidedParameter(Integer randomNumber) {
    Assertions.assertNotNull(randomNumber);
  }
}
