package io.github.farrukhjon.experiment.java.basic;

public class FinalVariableDemo {

  public static void main(String[] args) {
    final Point point = new Point(0, 0);
    //point = new Point(1, 1); //The compile-time error: cannot assign a value to the final variable point
  }

  private static class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }

    public int getX() {
      return x;
    }

    public void setX(final int x) {
      this.x = x;
    }

    public int getY() {
      return y;
    }

    public void setY(final int y) {
      this.y = y;
    }
  }
}
