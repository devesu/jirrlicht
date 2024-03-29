/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public enum EMD2_ANIMATION_TYPE {
  EMAT_STAND(0),
  EMAT_RUN,
  EMAT_ATTACK,
  EMAT_PAIN_A,
  EMAT_PAIN_B,
  EMAT_PAIN_C,
  EMAT_JUMP,
  EMAT_FLIP,
  EMAT_SALUTE,
  EMAT_FALLBACK,
  EMAT_WAVE,
  EMAT_POINT,
  EMAT_CROUCH_STAND,
  EMAT_CROUCH_WALK,
  EMAT_CROUCH_ATTACK,
  EMAT_CROUCH_PAIN,
  EMAT_CROUCH_DEATH,
  EMAT_DEATH_FALLBACK,
  EMAT_DEATH_FALLFORWARD,
  EMAT_DEATH_FALLBACKSLOW,
  EMAT_BOOM,
  EMAT_COUNT;

  public final int swigValue() {
    return swigValue;
  }

  public static EMD2_ANIMATION_TYPE swigToEnum(int swigValue) {
    EMD2_ANIMATION_TYPE[] swigValues = EMD2_ANIMATION_TYPE.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (EMD2_ANIMATION_TYPE swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + EMD2_ANIMATION_TYPE.class + " with value " + swigValue);
  }

  private EMD2_ANIMATION_TYPE() {
    this.swigValue = SwigNext.next++;
  }

  private EMD2_ANIMATION_TYPE(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  private EMD2_ANIMATION_TYPE(EMD2_ANIMATION_TYPE swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

