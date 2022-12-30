package io.github.farrukhjon.experiment.java.exceptions.exceptions;

public class ThrowExceptionByBodyMethod {

  public static void main(String[] args) {
    new ThrowExceptionByBodyMethod().ubsupportedExc();
  }

  private void ubsupportedExc() {
    throw new UnsupportedOperationException("must be completely implemented body of method");
  }
}
