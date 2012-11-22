/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public class SModifierFunction {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SModifierFunction(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SModifierFunction obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JirrJNI.delete_SModifierFunction(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SModifierFunction() {
    this(JirrJNI.new_SModifierFunction(), true);
  }

  public void setMasterfunc0(eQ3ModifierFunction value) {
    JirrJNI.SModifierFunction_masterfunc0_set(swigCPtr, this, value.swigValue());
  }

  public eQ3ModifierFunction getMasterfunc0() {
    return eQ3ModifierFunction.swigToEnum(JirrJNI.SModifierFunction_masterfunc0_get(swigCPtr, this));
  }

  public void setMasterfunc1(eQ3ModifierFunction value) {
    JirrJNI.SModifierFunction_masterfunc1_set(swigCPtr, this, value.swigValue());
  }

  public eQ3ModifierFunction getMasterfunc1() {
    return eQ3ModifierFunction.swigToEnum(JirrJNI.SModifierFunction_masterfunc1_get(swigCPtr, this));
  }

  public void setFunc(eQ3ModifierFunction value) {
    JirrJNI.SModifierFunction_func_set(swigCPtr, this, value.swigValue());
  }

  public eQ3ModifierFunction getFunc() {
    return eQ3ModifierFunction.swigToEnum(JirrJNI.SModifierFunction_func_get(swigCPtr, this));
  }

  public void setTcgen(eQ3ModifierFunction value) {
    JirrJNI.SModifierFunction_tcgen_set(swigCPtr, this, value.swigValue());
  }

  public eQ3ModifierFunction getTcgen() {
    return eQ3ModifierFunction.swigToEnum(JirrJNI.SModifierFunction_tcgen_get(swigCPtr, this));
  }

  public void setRgbgen(eQ3ModifierFunction value) {
    JirrJNI.SModifierFunction_rgbgen_set(swigCPtr, this, value.swigValue());
  }

  public eQ3ModifierFunction getRgbgen() {
    return eQ3ModifierFunction.swigToEnum(JirrJNI.SModifierFunction_rgbgen_get(swigCPtr, this));
  }

  public void setAlphagen(eQ3ModifierFunction value) {
    JirrJNI.SModifierFunction_alphagen_set(swigCPtr, this, value.swigValue());
  }

  public eQ3ModifierFunction getAlphagen() {
    return eQ3ModifierFunction.swigToEnum(JirrJNI.SModifierFunction_alphagen_get(swigCPtr, this));
  }

  public void setPhase(float value) {
    JirrJNI.SModifierFunction_phase_set(swigCPtr, this, value);
  }

  public float getPhase() {
    return JirrJNI.SModifierFunction_phase_get(swigCPtr, this);
  }

  public void setX(float value) {
    JirrJNI.SModifierFunction_x_set(swigCPtr, this, value);
  }

  public float getX() {
    return JirrJNI.SModifierFunction_x_get(swigCPtr, this);
  }

  public void setY(float value) {
    JirrJNI.SModifierFunction_y_set(swigCPtr, this, value);
  }

  public float getY() {
    return JirrJNI.SModifierFunction_y_get(swigCPtr, this);
  }

  public void setZ(float value) {
    JirrJNI.SModifierFunction_z_set(swigCPtr, this, value);
  }

  public float getZ() {
    return JirrJNI.SModifierFunction_z_get(swigCPtr, this);
  }

  public void setCount(long value) {
    JirrJNI.SModifierFunction_count_set(swigCPtr, this, value);
  }

  public long getCount() {
    return JirrJNI.SModifierFunction_count_get(swigCPtr, this);
  }

  public float evaluate(float dt) {
    return JirrJNI.SModifierFunction_evaluate(swigCPtr, this, dt);
  }

}
