package io.github.farrukhjon.experiment.java.object;

public class StaticFieldIsClassLevelVariable {

  public static void main(String[] args) {
    System.out.println(ClassA.aStaticStringField);
    System.out.println(ClassB.aStaticStringField);

    ClassB.aStaticStringField = "Hello from B";

    System.out.println(ClassA.aStaticStringField);
    System.out.println(ClassB.aStaticStringField);

    final ClassA classAInst = new ClassA();
    final String aStaticStringField = classAInst.aStaticStringField;
    System.out.println(aStaticStringField);
    classAInst.aStaticStringField = "Hello from A again";

    final ClassB classBInst = new ClassB();
    System.out.println(classBInst.aStaticStringField);
  }

  private static class ClassA {

    public static String aStaticStringField = "Hello from A";

  }

  private static class ClassB extends ClassA {
  }
}
