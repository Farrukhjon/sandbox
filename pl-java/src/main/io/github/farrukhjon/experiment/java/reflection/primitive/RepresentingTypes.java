/**
 *
 */

package io.github.farrukhjon.experiment.java.reflection.primitive;

import java.lang.reflect.Method;
import java.util.Vector;

/**
 * @author Farrukhjon SATTOROV, Dec 8, 2014
 *
 */
public class RepresentingTypes {

  public static void main(String[] args) throws NoSuchMethodException, SecurityException {

    Method method = Vector.class.getMethod("get", int.class);
    System.out.println(method);

    Method addAll = Vector.class.getMethod("copyInto", Object[].class);
    System.out.println(addAll.toGenericString());
  }

}
