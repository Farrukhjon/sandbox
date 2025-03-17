package io.github.farrukhjon.experiment.java.enumtest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class EnumTest {

  @Test
  void testThrowsIllegalArgumentExceptionWhenDoesNotContainSuchConstant() {
    //given:
    String nonEmptyStr = "FOURTH";
    //when:
    Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
      LevelE.valueOf(nonEmptyStr);
    });
    assertNotNull(exception);
    assertEquals("No enum constant io.github.farrukhjon.experiment.java.java.enumtest.LevelE.FOURTH", exception.getMessage());
  }

  @Test
  void testThrowsIllegalArgumentExceptionWhenDoesNotContainSuchConstantEmptyCase() {
    //given:
    String emptyStr = "";
    //when:
    Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
      LevelE.valueOf(emptyStr);
    });
    assertNotNull(exception);
    assertEquals("No enum constant io.github.farrukhjon.experiment.java.java.enumtest.LevelE.", exception.getMessage());
  }

  @Test
  void testThrowsNulPointerException() {
    //given:
    String str = null;
    //when:
    Throwable exception = assertThrows(NullPointerException.class, () -> {
      LevelE.valueOf(str);
    });
    assertNotNull(exception);
    assertEquals("Name is null", exception.getMessage());
  }

  @Test
  void testConvertStringToEnumObject() {
    //given:
    String str = "FIRST";

    //when:
    LevelE firstLevel = Enum.valueOf(LevelE.class, str);

    //then:
    assertNotNull(firstLevel);
    assertEquals(LevelE.FIRST, firstLevel);
  }

  @Test
  void testThrowsNulPointerExceptionEnumValueOf() {
    //given:
    String str = null;
    //when:
    Throwable exception = assertThrows(NullPointerException.class, () -> {
      Enum.valueOf(LevelE.class, str);
    });
    assertNotNull(exception);
    assertEquals("Name is null", exception.getMessage());
  }

  @Test
  void testThrowsIllegalArgumentExceptionWhenDoesNotContainSuchConstantEnumValueOf() {
    //given:
    String nonEmptyStr = "FOURTH";
    //when:
    Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
      Enum.valueOf(LevelE.class, nonEmptyStr);
    });
    assertNotNull(exception);
    assertEquals("No enum constant io.github.farrukhjon.experiment.java.java.enumtest.LevelE.FOURTH", exception.getMessage());
  }

}
