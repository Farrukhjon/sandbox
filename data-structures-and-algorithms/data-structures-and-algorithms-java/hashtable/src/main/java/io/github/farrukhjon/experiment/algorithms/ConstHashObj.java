package io.github.farrukhjon.experiment.algorithms;

public class ConstHashObj {

  private static final int id = 1;

  @Override
  public int hashCode() {
    return id;
  }

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
    ConstHashObj other = (ConstHashObj) obj;
	  if (id != other.id) {
		  return false;
	  }
    return true;
  }

  @Override
  public String toString() {
    return String.valueOf(id);
  }

}
