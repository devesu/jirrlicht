/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public enum E_MODULATE_FUNC {
  EMFN_MODULATE_1X(1),
  EMFN_MODULATE_2X(2),
  EMFN_MODULATE_4X(4);

  public final int swigValue() {
    return swigValue;
  }

  public static E_MODULATE_FUNC swigToEnum(int swigValue) {
    E_MODULATE_FUNC[] swigValues = E_MODULATE_FUNC.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (E_MODULATE_FUNC swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + E_MODULATE_FUNC.class + " with value " + swigValue);
  }

  private E_MODULATE_FUNC() {
    this.swigValue = SwigNext.next++;
  }

  private E_MODULATE_FUNC(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  private E_MODULATE_FUNC(E_MODULATE_FUNC swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

