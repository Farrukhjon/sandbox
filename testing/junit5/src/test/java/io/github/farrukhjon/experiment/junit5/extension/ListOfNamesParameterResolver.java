package io.github.farrukhjon.experiment.junit5.extension;

import java.util.Arrays;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

public class ListOfNamesParameterResolver implements ParameterResolver {

  @Override
  public boolean supportsParameter(final ParameterContext parameterContext, final ExtensionContext extensionContext)
      throws ParameterResolutionException {
    return parameterContext.getParameter().getType() == String.class;
  }

  @Override
  public Object resolveParameter(final ParameterContext parameterContext, final ExtensionContext extensionContext)
      throws ParameterResolutionException {
    return Arrays.asList("Ali", "Vali");
  }

}
