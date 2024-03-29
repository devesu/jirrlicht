/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public class SGUISpriteFrame {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SGUISpriteFrame(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SGUISpriteFrame obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JirrJNI.delete_SGUISpriteFrame(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTextureNumber(long value) {
    JirrJNI.SGUISpriteFrame_textureNumber_set(swigCPtr, this, value);
  }

  public long getTextureNumber() {
    return JirrJNI.SGUISpriteFrame_textureNumber_get(swigCPtr, this);
  }

  public void setRectNumber(long value) {
    JirrJNI.SGUISpriteFrame_rectNumber_set(swigCPtr, this, value);
  }

  public long getRectNumber() {
    return JirrJNI.SGUISpriteFrame_rectNumber_get(swigCPtr, this);
  }

  public SGUISpriteFrame() {
    this(JirrJNI.new_SGUISpriteFrame(), true);
  }

}
