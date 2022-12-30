package io.github.farrukhjon.experiment.java.reflection.classes;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public class GetGenParam<T extends Number, K extends Serializable> {

  public <E extends Object> GetGenParam() {
  }

  public static void main(String[] args) {
    GetGenParam<Integer, Serializable> ggp = new GetGenParam<>();
    ggp.printClassParam();
    ggp.printConstructorParam();
  }

  private void printClassParam() {
    try {
      Class c = Class.forName("reflection.classes.GetGenParam");
      TypeVariable[] tvs = c.getTypeParameters();
      for (TypeVariable tv : tvs) {
        Type[] types = tv.getBounds();
        for (Type type : types) {
          Class clazz = (Class) type;
          System.out.println(clazz.getSimpleName());
        }
      }
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SecurityException e) {
      e.printStackTrace();
    }
  }

  private void printConstructorParam() {
    try {
      Class c = Class.forName("reflection.classes.GetGenParam");
      TypeVariable[] tvs = c.getConstructor().getTypeParameters();
      for (TypeVariable tv : tvs) {
        Type[] types = tv.getBounds();
        for (Type type : types) {
          Class clazz = (Class) type;
          System.out.println(clazz.getSimpleName());
        }
      }
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SecurityException e) {
      e.printStackTrace();
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    }
  }
}
