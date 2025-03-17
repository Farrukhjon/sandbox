package io.github.farrukhjon.experiment.java.exceptions.runtimeException;

import java.util.ArrayList;
import java.util.List;

public class AvoidClassCastException {

  public static void main(String[] args) {

    List<Object> list = new ArrayList<Object>();

    list.add(Integer.valueOf(1));
    list.add(Integer.valueOf(2));
    list.add(Integer.valueOf(3));

    list.add("hello");
    list.add("java");
    list.add("world!");

    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) instanceof Integer) {
        Integer val = (Integer) list.get(i);
        System.out.println(val);
      }
      if (list.get(i) instanceof String) {
        String str = (String) list.get(i);
        System.out.println(str);
      }
    }
  }

}
