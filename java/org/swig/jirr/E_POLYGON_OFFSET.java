/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public enum E_POLYGON_OFFSET {
  EPO_BACK(0),
  EPO_FRONT(1);

  public final int swigValue() {
    return swigValue;
  }

  public static E_POLYGON_OFFSET swigToEnum(int swigValue) {
    E_POLYGON_OFFSET[] swigValues = E_POLYGON_OFFSET.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (E_POLYGON_OFFSET swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + E_POLYGON_OFFSET.class + " with value " + swigValue);
  }

  private E_POLYGON_OFFSET() {
    this.swigValue = SwigNext.next++;
  }

  private E_POLYGON_OFFSET(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  private E_POLYGON_OFFSET(E_POLYGON_OFFSET swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

