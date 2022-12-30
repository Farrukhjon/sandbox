package io.github.farrukhjon.experiment.java.conversions;

public class FloatToInt {


  public static void main(String[] args) {
    float f1 = 3.14f;
    float f2 = 3.99999f;

    //type casting
    int intOfF1 = (int) f1;
    int intOfF2 = (int) f2;

    //type rounding
    int intOfF1ByRnd = Math.round(f1);
    int intOfF2ByRnd = Math.round(f2);

    assert intOfF1 == 3;
    assert intOfF2 == 3;

    assert intOfF1ByRnd == 3;
    assert intOfF2ByRnd == 4;

    final int intOfF1ByFloatIntValue = Float.valueOf(f1).intValue();
    final int intOfF2ByFloatIntValue = Float.valueOf(f2).intValue();

    assert intOfF1ByFloatIntValue == 3;
    assert intOfF2ByFloatIntValue == 3;
  }

}
