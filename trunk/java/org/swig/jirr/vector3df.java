/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public class vector3df {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected vector3df(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(vector3df obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JirrJNI.delete_vector3df(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public vector3df() {
    this(JirrJNI.new_vector3df__SWIG_0(), true);
  }

  public vector3df(float nx, float ny, float nz) {
    this(JirrJNI.new_vector3df__SWIG_1(nx, ny, nz), true);
  }

  public vector3df(float n) {
    this(JirrJNI.new_vector3df__SWIG_2(n), true);
  }

  public vector3df(vector3df other) {
    this(JirrJNI.new_vector3df__SWIG_3(vector3df.getCPtr(other), other), true);
  }

  public vector3df subtractOperator() {
    return new vector3df(JirrJNI.vector3df_subtractOperator__SWIG_0(swigCPtr, this), true);
  }

  public vector3df assignOperator(vector3df other) {
    return new vector3df(JirrJNI.vector3df_assignOperator(swigCPtr, this, vector3df.getCPtr(other), other), false);
  }

  public vector3df addOperator(vector3df other) {
    return new vector3df(JirrJNI.vector3df_addOperator__SWIG_0(swigCPtr, this, vector3df.getCPtr(other), other), true);
  }

  public vector3df assignPlusOperator(vector3df other) {
    return new vector3df(JirrJNI.vector3df_assignPlusOperator__SWIG_0(swigCPtr, this, vector3df.getCPtr(other), other), false);
  }

  public vector3df addOperator(float val) {
    return new vector3df(JirrJNI.vector3df_addOperator__SWIG_1(swigCPtr, this, val), true);
  }

  public vector3df assignPlusOperator(float val) {
    return new vector3df(JirrJNI.vector3df_assignPlusOperator__SWIG_1(swigCPtr, this, val), false);
  }

  public vector3df subtractOperator(vector3df other) {
    return new vector3df(JirrJNI.vector3df_subtractOperator__SWIG_1(swigCPtr, this, vector3df.getCPtr(other), other), true);
  }

  public vector3df assignMinusOperator(vector3df other) {
    return new vector3df(JirrJNI.vector3df_assignMinusOperator__SWIG_0(swigCPtr, this, vector3df.getCPtr(other), other), false);
  }

  public vector3df subtractOperator(float val) {
    return new vector3df(JirrJNI.vector3df_subtractOperator__SWIG_2(swigCPtr, this, val), true);
  }

  public vector3df assignMinusOperator(float val) {
    return new vector3df(JirrJNI.vector3df_assignMinusOperator__SWIG_1(swigCPtr, this, val), false);
  }

  public vector3df timesOperator(vector3df other) {
    return new vector3df(JirrJNI.vector3df_timesOperator__SWIG_0(swigCPtr, this, vector3df.getCPtr(other), other), true);
  }

  public vector3df assignTimesOperator(vector3df other) {
    return new vector3df(JirrJNI.vector3df_assignTimesOperator__SWIG_0(swigCPtr, this, vector3df.getCPtr(other), other), false);
  }

  public vector3df timesOperator(float v) {
    return new vector3df(JirrJNI.vector3df_timesOperator__SWIG_1(swigCPtr, this, v), true);
  }

  public vector3df assignTimesOperator(float v) {
    return new vector3df(JirrJNI.vector3df_assignTimesOperator__SWIG_1(swigCPtr, this, v), false);
  }

  public vector3df dividedOperator(vector3df other) {
    return new vector3df(JirrJNI.vector3df_dividedOperator__SWIG_0(swigCPtr, this, vector3df.getCPtr(other), other), true);
  }

  public vector3df assignDivideOperator(vector3df other) {
    return new vector3df(JirrJNI.vector3df_assignDivideOperator__SWIG_0(swigCPtr, this, vector3df.getCPtr(other), other), false);
  }

  public vector3df dividedOperator(float v) {
    return new vector3df(JirrJNI.vector3df_dividedOperator__SWIG_1(swigCPtr, this, v), true);
  }

  public vector3df assignDivideOperator(float v) {
    return new vector3df(JirrJNI.vector3df_assignDivideOperator__SWIG_1(swigCPtr, this, v), false);
  }

  public boolean lessThanOrEqualOperator(vector3df other) {
    return JirrJNI.vector3df_lessThanOrEqualOperator(swigCPtr, this, vector3df.getCPtr(other), other);
  }

  public boolean moreThanOrEqualOperator(vector3df other) {
    return JirrJNI.vector3df_moreThanOrEqualOperator(swigCPtr, this, vector3df.getCPtr(other), other);
  }

  public boolean lessThanOperator(vector3df other) {
    return JirrJNI.vector3df_lessThanOperator(swigCPtr, this, vector3df.getCPtr(other), other);
  }

  public boolean moreThanOperator(vector3df other) {
    return JirrJNI.vector3df_moreThanOperator(swigCPtr, this, vector3df.getCPtr(other), other);
  }

  public boolean equalsOperator(vector3df other) {
    return JirrJNI.vector3df_equalsOperator(swigCPtr, this, vector3df.getCPtr(other), other);
  }

  public boolean notEqualsOperator(vector3df other) {
    return JirrJNI.vector3df_notEqualsOperator(swigCPtr, this, vector3df.getCPtr(other), other);
  }

  public boolean equals(vector3df other, float tolerance) {
    return JirrJNI.vector3df_equals__SWIG_0(swigCPtr, this, vector3df.getCPtr(other), other, tolerance);
  }

  public boolean equals(vector3df other) {
    return JirrJNI.vector3df_equals__SWIG_1(swigCPtr, this, vector3df.getCPtr(other), other);
  }

  public vector3df set(float nx, float ny, float nz) {
    return new vector3df(JirrJNI.vector3df_set__SWIG_0(swigCPtr, this, nx, ny, nz), false);
  }

  public vector3df set(vector3df p) {
    return new vector3df(JirrJNI.vector3df_set__SWIG_1(swigCPtr, this, vector3df.getCPtr(p), p), false);
  }

  public float getLength() {
    return JirrJNI.vector3df_getLength(swigCPtr, this);
  }

  public float getLengthSQ() {
    return JirrJNI.vector3df_getLengthSQ(swigCPtr, this);
  }

  public float dotProduct(vector3df other) {
    return JirrJNI.vector3df_dotProduct(swigCPtr, this, vector3df.getCPtr(other), other);
  }

  public float getDistanceFrom(vector3df other) {
    return JirrJNI.vector3df_getDistanceFrom(swigCPtr, this, vector3df.getCPtr(other), other);
  }

  public float getDistanceFromSQ(vector3df other) {
    return JirrJNI.vector3df_getDistanceFromSQ(swigCPtr, this, vector3df.getCPtr(other), other);
  }

  public vector3df crossProduct(vector3df p) {
    return new vector3df(JirrJNI.vector3df_crossProduct(swigCPtr, this, vector3df.getCPtr(p), p), true);
  }

  public boolean isBetweenPoints(vector3df begin, vector3df end) {
    return JirrJNI.vector3df_isBetweenPoints(swigCPtr, this, vector3df.getCPtr(begin), begin, vector3df.getCPtr(end), end);
  }

  public vector3df normalize() {
    return new vector3df(JirrJNI.vector3df_normalize(swigCPtr, this), false);
  }

  public vector3df setLength(float newlength) {
    return new vector3df(JirrJNI.vector3df_setLength(swigCPtr, this, newlength), false);
  }

  public vector3df invert() {
    return new vector3df(JirrJNI.vector3df_invert(swigCPtr, this), false);
  }

  public void rotateXZBy(double degrees, vector3df center) {
    JirrJNI.vector3df_rotateXZBy__SWIG_0(swigCPtr, this, degrees, vector3df.getCPtr(center), center);
  }

  public void rotateXZBy(double degrees) {
    JirrJNI.vector3df_rotateXZBy__SWIG_1(swigCPtr, this, degrees);
  }

  public void rotateXYBy(double degrees, vector3df center) {
    JirrJNI.vector3df_rotateXYBy__SWIG_0(swigCPtr, this, degrees, vector3df.getCPtr(center), center);
  }

  public void rotateXYBy(double degrees) {
    JirrJNI.vector3df_rotateXYBy__SWIG_1(swigCPtr, this, degrees);
  }

  public void rotateYZBy(double degrees, vector3df center) {
    JirrJNI.vector3df_rotateYZBy__SWIG_0(swigCPtr, this, degrees, vector3df.getCPtr(center), center);
  }

  public void rotateYZBy(double degrees) {
    JirrJNI.vector3df_rotateYZBy__SWIG_1(swigCPtr, this, degrees);
  }

  public vector3df getInterpolated(vector3df other, double d) {
    return new vector3df(JirrJNI.vector3df_getInterpolated(swigCPtr, this, vector3df.getCPtr(other), other, d), true);
  }

  public vector3df getInterpolated_quadratic(vector3df v2, vector3df v3, double d) {
    return new vector3df(JirrJNI.vector3df_getInterpolated_quadratic(swigCPtr, this, vector3df.getCPtr(v2), v2, vector3df.getCPtr(v3), v3, d), true);
  }

  public vector3df interpolate(vector3df a, vector3df b, double d) {
    return new vector3df(JirrJNI.vector3df_interpolate(swigCPtr, this, vector3df.getCPtr(a), a, vector3df.getCPtr(b), b, d), false);
  }

  public vector3df getHorizontalAngle() {
    return new vector3df(JirrJNI.vector3df_getHorizontalAngle(swigCPtr, this), true);
  }

  public vector3df getSphericalCoordinateAngles() {
    return new vector3df(JirrJNI.vector3df_getSphericalCoordinateAngles(swigCPtr, this), true);
  }

  public vector3df rotationToDirection(vector3df forwards) {
    return new vector3df(JirrJNI.vector3df_rotationToDirection__SWIG_0(swigCPtr, this, vector3df.getCPtr(forwards), forwards), true);
  }

  public vector3df rotationToDirection() {
    return new vector3df(JirrJNI.vector3df_rotationToDirection__SWIG_1(swigCPtr, this), true);
  }

  public void getAs4Values(SWIGTYPE_p_float array) {
    JirrJNI.vector3df_getAs4Values(swigCPtr, this, SWIGTYPE_p_float.getCPtr(array));
  }

  public void getAs3Values(SWIGTYPE_p_float array) {
    JirrJNI.vector3df_getAs3Values(swigCPtr, this, SWIGTYPE_p_float.getCPtr(array));
  }

  public vector3df setX(float value) {
    JirrJNI.vector3df_X_set(swigCPtr, this, value);
    return this;
  }
  
  public vector3df addX(float value) {
    float x=JirrJNI.vector3df_X_get(swigCPtr, this);
    setX(x+value);
    return this;
  }

  public float getX() {
    return JirrJNI.vector3df_X_get(swigCPtr, this);
  }

  public vector3df setY(float value) {
    JirrJNI.vector3df_Y_set(swigCPtr, this, value);
    return this;
  }
  
  public vector3df addY(float value) {
    float y=JirrJNI.vector3df_Y_get(swigCPtr, this);
    setY(y+value);
    return this;
  }
  
  public vector3df addZ(float value) {
    float z=JirrJNI.vector3df_Z_get(swigCPtr, this);
    setZ(z+value);
    return this;
  }

  public float getY() {
    return JirrJNI.vector3df_Y_get(swigCPtr, this);
  }

  public vector3df setZ(float value) {
    JirrJNI.vector3df_Z_set(swigCPtr, this, value);
    return this;
  }

  public float getZ() {
    return JirrJNI.vector3df_Z_get(swigCPtr, this);
  }

    @Override
    public String toString() {
        return String.format("X=%.5f; Y=%.5f; Z=%.5f", getX(), getY(), getZ());
    }
}
