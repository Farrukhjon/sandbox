package io.github.farrukhjon.experiment.java.arithmetic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DivideByReminderAndModulusTest {

  ModFunction modFunction = new ModFunction();

  @Test
  void testBuiltInModOrReminderOperator() {
    assertEquals(2, 5 % 3);
    assertEquals(-2, -5 % 3);
    assertEquals(2, 5 % -3);
    assertEquals(-2, -5 % -3);
  }

  @Test
  void testFloorModulusFunction() {
    int floorModPosDivisiblePosDivisor = Math.floorMod(5, 3);
    int floorModNegDivisiblePosDivisor = Math.floorMod(-5, 3);
    int floorModPosDivisibleNegDivisor = Math.floorMod(5, -3);
    int floorModNegDivisibleNegDivisor = Math.floorMod(-5, -3);

    assertEquals(2, floorModPosDivisiblePosDivisor);
    assertEquals(1, floorModNegDivisiblePosDivisor);
    assertEquals(-1, floorModPosDivisibleNegDivisor);
    assertEquals(-2, floorModNegDivisibleNegDivisor);
  }

  @Test
  void testCustomModulusFunction() {
    int reminderPos = modFunction.mod(5, 3);
    int reminderNeg = modFunction.mod(-5, 3);
    assertEquals(2, reminderPos);
    assertEquals(1, reminderNeg);
  }
}
