/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public enum eQ3ModifierFunction {
  
  TCMOD(0),
  DEFORMVERTEXES(1),
  RGBGEN(2),
  TCGEN(3),
  MAP(4),
  ALPHAGEN(5),
  FUNCTION2(0x10),
  SCROLL(0x10+1),
  SCALE(0x10+2),
  ROTATE(0x10+3),
  STRETCH(0x10+4),
  TURBULENCE(0x10+5),
  WAVE(0x10+6),
  IDENTITY(0x10+7),
  VERTEX(0x10+8),
  TEXTURE(0x10+9),
  LIGHTMAP(0x10+10),
  ENVIRONMENT(0x10+11),
  DOLLAR_LIGHTMAP(0x10+12),
  BULGE(0x10+13),
  AUTOSPRITE(0x10+14),
  AUTOSPRITE2(0x10+15),
  TRANSFORM(0x10+16),
  EXACTVERTEX(0x10+17),
  CONSTANT(0x10+18),
  LIGHTINGSPECULAR(0x10+19),
  MOVE(0x10+20),
  NORMAL(0x10+21),
  IDENTITYLIGHTING(0x10+22),
  WAVE_MODIFIER_FUNCTION(0x30),
  SINUS(0x30+1),
  COSINUS(0x30+2),
  SQUARE(0x30+3),
  TRIANGLE(0x30+4),
  SAWTOOTH(0x30+5),
  SAWTOOTH_INVERSE(0x30+6),
  NOISE(0x30+7),
  UNKNOWN(-2);

  public final int swigValue() {
    return swigValue;
  }

  public static eQ3ModifierFunction swigToEnum(int swigValue) {
    eQ3ModifierFunction[] swigValues = eQ3ModifierFunction.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (eQ3ModifierFunction swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + eQ3ModifierFunction.class + " with value " + swigValue);
  }

  private eQ3ModifierFunction() {
    this.swigValue = SwigNext.next++;
  }

  private eQ3ModifierFunction(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  private eQ3ModifierFunction(eQ3ModifierFunction swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}
