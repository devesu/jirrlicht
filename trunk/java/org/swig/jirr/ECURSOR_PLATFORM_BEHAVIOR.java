/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public enum ECURSOR_PLATFORM_BEHAVIOR {
  ECPB_NONE(0),
  ECPB_X11_CACHE_UPDATES(1);

  public final int swigValue() {
    return swigValue;
  }

  public static ECURSOR_PLATFORM_BEHAVIOR swigToEnum(int swigValue) {
    ECURSOR_PLATFORM_BEHAVIOR[] swigValues = ECURSOR_PLATFORM_BEHAVIOR.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (ECURSOR_PLATFORM_BEHAVIOR swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + ECURSOR_PLATFORM_BEHAVIOR.class + " with value " + swigValue);
  }

  private ECURSOR_PLATFORM_BEHAVIOR() {
    this.swigValue = SwigNext.next++;
  }

  private ECURSOR_PLATFORM_BEHAVIOR(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  private ECURSOR_PLATFORM_BEHAVIOR(ECURSOR_PLATFORM_BEHAVIOR swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

