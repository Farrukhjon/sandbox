package io.github.farrukhjon.experiment.junit5.extension;

import java.util.Random;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

public class RandomNumberExtension implements ParameterResolver {

  @Override
  public boolean supportsParameter(final ParameterContext parameterContext, final ExtensionContext extensionContext)
      throws ParameterResolutionException {
    return true;
  }

  @Override
  public Object resolveParameter(final ParameterContext parameterContext, final ExtensionContext extensionContext)
      throws ParameterResolutionException {
    return new Random().nextInt();
  }
}
