/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public enum E_COMPARISON_FUNC {
  ECFN_NEVER(0),
  ECFN_LESSEQUAL(1),
  ECFN_EQUAL(2),
  ECFN_LESS,
  ECFN_NOTEQUAL,
  ECFN_GREATEREQUAL,
  ECFN_GREATER,
  ECFN_ALWAYS;

  public final int swigValue() {
    return swigValue;
  }

  public static E_COMPARISON_FUNC swigToEnum(int swigValue) {
    E_COMPARISON_FUNC[] swigValues = E_COMPARISON_FUNC.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (E_COMPARISON_FUNC swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + E_COMPARISON_FUNC.class + " with value " + swigValue);
  }

  private E_COMPARISON_FUNC() {
    this.swigValue = SwigNext.next++;
  }

  private E_COMPARISON_FUNC(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  private E_COMPARISON_FUNC(E_COMPARISON_FUNC swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

