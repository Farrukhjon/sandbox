package io.github.farrukhjon.experiment.java.language.hashCode;

import java.io.Serializable;

public class Person implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 8994478264871882969L;
  private long id;
  private String name;
  private int age;

  @Override
  public boolean equals(Object obj) {
	  if (this == obj) {
		  return true;
	  }
	  if (obj == null) {
		  return false;
	  }
	  if (getClass() != obj.getClass()) {
		  return false;
	  }
    Person other = (Person) obj;
	  return id == other.id;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (int) (id ^ (id >>> 32));
    return result;
  }

}
