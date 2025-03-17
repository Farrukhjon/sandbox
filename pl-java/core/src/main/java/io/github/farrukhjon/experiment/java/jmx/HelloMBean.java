package io.github.farrukhjon.experiment.java.jmx;

public interface HelloMBean {
  String getMessage();

  void setMessage(String message);

  void sayHello();
}
