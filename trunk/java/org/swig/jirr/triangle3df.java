/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public class triangle3df {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected triangle3df(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(triangle3df obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JirrJNI.delete_triangle3df(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public triangle3df() {
    this(JirrJNI.new_triangle3df__SWIG_0(), true);
  }

  public triangle3df(vector3df v1, vector3df v2, vector3df v3) {
    this(JirrJNI.new_triangle3df__SWIG_1(vector3df.getCPtr(v1), v1, vector3df.getCPtr(v2), v2, vector3df.getCPtr(v3), v3), true);
  }

  public boolean equalsOperator(triangle3df other) {
    return JirrJNI.triangle3df_equalsOperator(swigCPtr, this, triangle3df.getCPtr(other), other);
  }

  public boolean notEqualsOperator(triangle3df other) {
    return JirrJNI.triangle3df_notEqualsOperator(swigCPtr, this, triangle3df.getCPtr(other), other);
  }

  public boolean isTotalInsideBox(aabbox3df box) {
    return JirrJNI.triangle3df_isTotalInsideBox(swigCPtr, this, aabbox3df.getCPtr(box), box);
  }

  public boolean isTotalOutsideBox(aabbox3df box) {
    return JirrJNI.triangle3df_isTotalOutsideBox(swigCPtr, this, aabbox3df.getCPtr(box), box);
  }

  public vector3df closestPointOnTriangle(vector3df p) {
    return new vector3df(JirrJNI.triangle3df_closestPointOnTriangle(swigCPtr, this, vector3df.getCPtr(p), p), true);
  }

  public boolean isPointInside(vector3df p) {
    return JirrJNI.triangle3df_isPointInside(swigCPtr, this, vector3df.getCPtr(p), p);
  }

  public boolean isPointInsideFast(vector3df p) {
    return JirrJNI.triangle3df_isPointInsideFast(swigCPtr, this, vector3df.getCPtr(p), p);
  }

  public boolean getIntersectionWithLimitedLine(line3df line, vector3df outIntersection) {
    return JirrJNI.triangle3df_getIntersectionWithLimitedLine(swigCPtr, this, line3df.getCPtr(line), line, vector3df.getCPtr(outIntersection), outIntersection);
  }

  public boolean getIntersectionWithLine(vector3df linePoint, vector3df lineVect, vector3df outIntersection) {
    return JirrJNI.triangle3df_getIntersectionWithLine(swigCPtr, this, vector3df.getCPtr(linePoint), linePoint, vector3df.getCPtr(lineVect), lineVect, vector3df.getCPtr(outIntersection), outIntersection);
  }

  public boolean getIntersectionOfPlaneWithLine(vector3df linePoint, vector3df lineVect, vector3df outIntersection) {
    return JirrJNI.triangle3df_getIntersectionOfPlaneWithLine(swigCPtr, this, vector3df.getCPtr(linePoint), linePoint, vector3df.getCPtr(lineVect), lineVect, vector3df.getCPtr(outIntersection), outIntersection);
  }

  public vector3df getNormal() {
    return new vector3df(JirrJNI.triangle3df_getNormal(swigCPtr, this), true);
  }

  public boolean isFrontFacing(vector3df lookDirection) {
    return JirrJNI.triangle3df_isFrontFacing(swigCPtr, this, vector3df.getCPtr(lookDirection), lookDirection);
  }

  public plane3df getPlane() {
    return new plane3df(JirrJNI.triangle3df_getPlane(swigCPtr, this), true);
  }

  public float getArea() {
    return JirrJNI.triangle3df_getArea(swigCPtr, this);
  }

  public void set(vector3df a, vector3df b, vector3df c) {
    JirrJNI.triangle3df_set(swigCPtr, this, vector3df.getCPtr(a), a, vector3df.getCPtr(b), b, vector3df.getCPtr(c), c);
  }

  public void setPointA(vector3df value) {
    JirrJNI.triangle3df_pointA_set(swigCPtr, this, vector3df.getCPtr(value), value);
  }

  public vector3df getPointA() {
    long cPtr = JirrJNI.triangle3df_pointA_get(swigCPtr, this);
    return (cPtr == 0) ? null : new vector3df(cPtr, false);
  }

  public void setPointB(vector3df value) {
    JirrJNI.triangle3df_pointB_set(swigCPtr, this, vector3df.getCPtr(value), value);
  }

  public vector3df getPointB() {
    long cPtr = JirrJNI.triangle3df_pointB_get(swigCPtr, this);
    return (cPtr == 0) ? null : new vector3df(cPtr, false);
  }

  public void setPointC(vector3df value) {
    JirrJNI.triangle3df_pointC_set(swigCPtr, this, vector3df.getCPtr(value), value);
  }

  public vector3df getPointC() {
    long cPtr = JirrJNI.triangle3df_pointC_get(swigCPtr, this);
    return (cPtr == 0) ? null : new vector3df(cPtr, false);
  }

}