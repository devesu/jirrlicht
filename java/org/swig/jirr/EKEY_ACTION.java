/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public enum EKEY_ACTION {
  EKA_MOVE_FORWARD(0),
  EKA_MOVE_BACKWARD,
  EKA_STRAFE_LEFT,
  EKA_STRAFE_RIGHT,
  EKA_JUMP_UP,
  EKA_CROUCH,
  EKA_COUNT,
  EKA_FORCE_32BIT(0x7fffffff);

  public final int swigValue() {
    return swigValue;
  }

  public static EKEY_ACTION swigToEnum(int swigValue) {
    EKEY_ACTION[] swigValues = EKEY_ACTION.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (EKEY_ACTION swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + EKEY_ACTION.class + " with value " + swigValue);
  }

  private EKEY_ACTION() {
    this.swigValue = SwigNext.next++;
  }

  private EKEY_ACTION(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  private EKEY_ACTION(EKEY_ACTION swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}
