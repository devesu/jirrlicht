/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public enum eMD3Models {
  EMD3_HEAD(0),
  EMD3_UPPER,
  EMD3_LOWER,
  EMD3_WEAPON,
  EMD3_NUMMODELS;

  public final int swigValue() {
    return swigValue;
  }

  public static eMD3Models swigToEnum(int swigValue) {
    eMD3Models[] swigValues = eMD3Models.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (eMD3Models swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + eMD3Models.class + " with value " + swigValue);
  }

  private eMD3Models() {
    this.swigValue = SwigNext.next++;
  }

  private eMD3Models(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  private eMD3Models(eMD3Models swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}
