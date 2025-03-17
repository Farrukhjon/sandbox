package io.github.farrukhjon.experiment.java.oop.polymorphism;

/**
 * @author fsattorov
 */
public class PolymorphRefs {

  interface IDrawable {
    void draw();
  }

  static class Shape implements IDrawable {
    public void draw() {
      System.out.println("Drawing a Shape.");
    }
  }

  static class Circle extends Shape {
    public void draw() {
      System.out.println("Drawing a Circle.");
    }
  }

  static class Rectangle extends Shape {
    public void draw() {
      System.out.println("Drawing a Rectangle.");
    }
  }

  static class Square extends Rectangle {
    public void draw() {
      System.out.println("Drawing a Square.");
    }
  }

  static class Map implements IDrawable {
    public void draw() {
      System.out.println("Drawing a Map.");
    }
  }

  public static void main(String[] args) {
    Shape[] shapes = {new Circle(), new Rectangle(), new Square()};   // (1)
    IDrawable[] drawables = {new Shape(), new Rectangle(), new Map()};// (2)

    System.out.println("Draw shapes:");
    for (int i = 0; i < shapes.length; i++)                           // (3)
      shapes[i].draw();

    System.out.println("Draw drawables:");
    for (int i = 0; i < drawables.length; i++)                        // (4)
      drawables[i].draw();
  }

}
