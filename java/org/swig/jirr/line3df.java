/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public class line3df {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected line3df(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(line3df obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JirrJNI.delete_line3df(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public line3df() {
    this(JirrJNI.new_line3df__SWIG_0(), true);
  }

  public line3df(float xa, float ya, float za, float xb, float yb, float zb) {
    this(JirrJNI.new_line3df__SWIG_1(xa, ya, za, xb, yb, zb), true);
  }

  public line3df(vector3df start, vector3df end) {
    this(JirrJNI.new_line3df__SWIG_2(vector3df.getCPtr(start), start, vector3df.getCPtr(end), end), true);
  }

  public line3df addOperator(vector3df point) {
    return new line3df(JirrJNI.line3df_addOperator(swigCPtr, this, vector3df.getCPtr(point), point), true);
  }

  public line3df assignPlusOperator(vector3df point) {
    return new line3df(JirrJNI.line3df_assignPlusOperator(swigCPtr, this, vector3df.getCPtr(point), point), false);
  }

  public line3df subtractOperator(vector3df point) {
    return new line3df(JirrJNI.line3df_subtractOperator(swigCPtr, this, vector3df.getCPtr(point), point), true);
  }

  public line3df assignMinusOperator(vector3df point) {
    return new line3df(JirrJNI.line3df_assignMinusOperator(swigCPtr, this, vector3df.getCPtr(point), point), false);
  }

  public boolean equalsOperator(line3df other) {
    return JirrJNI.line3df_equalsOperator(swigCPtr, this, line3df.getCPtr(other), other);
  }

  public boolean notEqualsOperator(line3df other) {
    return JirrJNI.line3df_notEqualsOperator(swigCPtr, this, line3df.getCPtr(other), other);
  }

  public void setLine(float xa, float ya, float za, float xb, float yb, float zb) {
    JirrJNI.line3df_setLine__SWIG_0(swigCPtr, this, xa, ya, za, xb, yb, zb);
  }

  public void setLine(vector3df nstart, vector3df nend) {
    JirrJNI.line3df_setLine__SWIG_1(swigCPtr, this, vector3df.getCPtr(nstart), nstart, vector3df.getCPtr(nend), nend);
  }

  public void setLine(line3df line) {
    JirrJNI.line3df_setLine__SWIG_2(swigCPtr, this, line3df.getCPtr(line), line);
  }

  public float getLength() {
    return JirrJNI.line3df_getLength(swigCPtr, this);
  }

  public float getLengthSQ() {
    return JirrJNI.line3df_getLengthSQ(swigCPtr, this);
  }

  public vector3df getMiddle() {
    return new vector3df(JirrJNI.line3df_getMiddle(swigCPtr, this), true);
  }

  public vector3df getVector() {
    return new vector3df(JirrJNI.line3df_getVector(swigCPtr, this), true);
  }

  public boolean isPointBetweenStartAndEnd(vector3df point) {
    return JirrJNI.line3df_isPointBetweenStartAndEnd(swigCPtr, this, vector3df.getCPtr(point), point);
  }

  public vector3df getClosestPoint(vector3df point) {
    return new vector3df(JirrJNI.line3df_getClosestPoint(swigCPtr, this, vector3df.getCPtr(point), point), true);
  }

  public boolean getIntersectionWithSphere(vector3df sorigin, float sradius, SWIGTYPE_p_double outdistance) {
    return JirrJNI.line3df_getIntersectionWithSphere(swigCPtr, this, vector3df.getCPtr(sorigin), sorigin, sradius, SWIGTYPE_p_double.getCPtr(outdistance));
  }

  public void setStart(vector3df value) {
    JirrJNI.line3df_start_set(swigCPtr, this, vector3df.getCPtr(value), value);
  }

  public vector3df getStart() {
    long cPtr = JirrJNI.line3df_start_get(swigCPtr, this);
    return (cPtr == 0) ? null : new vector3df(cPtr, false);
  }

  public void setEnd(vector3df value) {
    JirrJNI.line3df_end_set(swigCPtr, this, vector3df.getCPtr(value), value);
  }

  public vector3df getEnd() {
    long cPtr = JirrJNI.line3df_end_get(swigCPtr, this);
    return (cPtr == 0) ? null : new vector3df(cPtr, false);
  }

    @Override
    public String toString() {
        String str="Start="+getStart().toString()+"; End="+getEnd().toString()+"; Length="+getLength();
        return str;
    }
  
  

}
