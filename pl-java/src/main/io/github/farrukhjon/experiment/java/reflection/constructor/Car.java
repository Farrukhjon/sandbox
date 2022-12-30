package io.github.farrukhjon.experiment.java.reflection.constructor;

public class Car {

  private final String type;
  private CarColor color;

  public Car(String type) {
    this.type = type;
  }

  public Car(String type, CarColor color) {
    this.type = type;
    this.color = color;
  }

  @Override
  public String toString() {
    return "type: " + type + ", color: " + color;
  }

  public enum CarColor {
    Black("Black"), Green("Green"), Red("Red");

    private final String color;

    CarColor(String color) {
      this.color = color;
    }

    @Override
    public String toString() {
      return this.color;
    }
  }

}
