package io.github.farrukhjon.experiment.java.object;

public class RefernceVariableToObjectInstance {

  public static void main(String[] args) {
    MyObject refVar1 = new MyObject();
    MyObject refVar2 = refVar1;

    System.out.println(refVar1);
    System.out.println(refVar2);

    refVar2.state = 1;

    System.out.println(refVar1);
    System.out.println(refVar2);
  }

  private static class MyObject {
    public int state = 0;

    @Override
    public String toString() {
      return "State of instance of MyObject is: " + state;
    }
  }

}
