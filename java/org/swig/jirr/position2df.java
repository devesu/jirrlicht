/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public class position2df extends vector2df{

  protected position2df(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(position2df obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

    @Override
  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JirrJNI.delete_position2df(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public position2df() {
    this(JirrJNI.new_position2df__SWIG_0(), true);
  }

  public position2df(float nx, float ny) {
    this(JirrJNI.new_position2df__SWIG_1(nx, ny), true);
  }

  public position2df(float n) {
    this(JirrJNI.new_position2df__SWIG_2(n), true);
  }

  public position2df(vector2df other) {
    this(JirrJNI.new_position2df__SWIG_3(vector2df.getCPtr(other), other), true);
  }

  public position2df(dimension2df other) {
    this(JirrJNI.new_position2df__SWIG_4(dimension2df.getCPtr(other), other), true);
  }
}
