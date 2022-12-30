package io.github.farrukhjon.experiment.java.reflection.constructor;

import java.lang.reflect.Constructor;

public class ConstructorReflectDemo {

  public static void main(String[] args) {

    Car car = new Car("Opel", Car.CarColor.Green);
    System.out.println(car);
    Class<?> clazz = car.getClass();
    Object obj = null;
    Constructor<?>[] constructors = clazz.getConstructors();
    Constructor<?> con = constructors[1];
    try {
      obj = con.newInstance("Volvo", Car.CarColor.Black);
      System.out.println(obj);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    Constructor<?>[] cons = Car.class.getConstructors();
    Constructor<?> con1 = cons[1];
    try {
      obj = con1.newInstance("Lada calina", Car.CarColor.Red);
      System.out.println(obj);
    } catch (Exception e) {
    }
  }
}
