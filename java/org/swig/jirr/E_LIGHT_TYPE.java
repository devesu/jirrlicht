/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public enum E_LIGHT_TYPE {
  ELT_POINT,
  ELT_SPOT,
  ELT_DIRECTIONAL,
  ELT_COUNT;

  public final int swigValue() {
    return swigValue;
  }

  public static E_LIGHT_TYPE swigToEnum(int swigValue) {
    E_LIGHT_TYPE[] swigValues = E_LIGHT_TYPE.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (E_LIGHT_TYPE swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + E_LIGHT_TYPE.class + " with value " + swigValue);
  }

  private E_LIGHT_TYPE() {
    this.swigValue = SwigNext.next++;
  }

  private E_LIGHT_TYPE(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  private E_LIGHT_TYPE(E_LIGHT_TYPE swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

