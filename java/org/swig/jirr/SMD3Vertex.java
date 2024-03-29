/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public class SMD3Vertex {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SMD3Vertex(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SMD3Vertex obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JirrJNI.delete_SMD3Vertex(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setPosition(short[] value) {
    JirrJNI.SMD3Vertex_position_set(swigCPtr, this, value);
  }

  public short[] getPosition() {
    return JirrJNI.SMD3Vertex_position_get(swigCPtr, this);
  }

  public void setNormal(short[] value) {
    JirrJNI.SMD3Vertex_normal_set(swigCPtr, this, value);
  }

  public short[] getNormal() {
    return JirrJNI.SMD3Vertex_normal_get(swigCPtr, this);
  }

  public SMD3Vertex() {
    this(JirrJNI.new_SMD3Vertex(), true);
  }

}
