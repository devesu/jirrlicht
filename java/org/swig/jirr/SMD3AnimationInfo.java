/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public class SMD3AnimationInfo {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SMD3AnimationInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SMD3AnimationInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JirrJNI.delete_SMD3AnimationInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFirst(int value) {
    JirrJNI.SMD3AnimationInfo_first_set(swigCPtr, this, value);
  }

  public int getFirst() {
    return JirrJNI.SMD3AnimationInfo_first_get(swigCPtr, this);
  }

  public void setNum(int value) {
    JirrJNI.SMD3AnimationInfo_num_set(swigCPtr, this, value);
  }

  public int getNum() {
    return JirrJNI.SMD3AnimationInfo_num_get(swigCPtr, this);
  }

  public void setLooping(int value) {
    JirrJNI.SMD3AnimationInfo_looping_set(swigCPtr, this, value);
  }

  public int getLooping() {
    return JirrJNI.SMD3AnimationInfo_looping_get(swigCPtr, this);
  }

  public void setFps(int value) {
    JirrJNI.SMD3AnimationInfo_fps_set(swigCPtr, this, value);
  }

  public int getFps() {
    return JirrJNI.SMD3AnimationInfo_fps_get(swigCPtr, this);
  }

  public SMD3AnimationInfo() {
    this(JirrJNI.new_SMD3AnimationInfo(), true);
  }

}
