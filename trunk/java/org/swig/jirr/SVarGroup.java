/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public class SVarGroup {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SVarGroup(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SVarGroup obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JirrJNI.delete_SVarGroup(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SVarGroup() {
    this(JirrJNI.new_SVarGroup(), true);
  }

  public long isDefined(String name, String content) {
    return JirrJNI.SVarGroup_isDefined__SWIG_0(swigCPtr, this, name, content);
  }

  public long isDefined(String name) {
    return JirrJNI.SVarGroup_isDefined__SWIG_1(swigCPtr, this, name);
  }

  public SWIGTYPE_p_irr__core__stringT_char_irrAllocatorT_char_t_t get(String name) {
    return new SWIGTYPE_p_irr__core__stringT_char_irrAllocatorT_char_t_t(JirrJNI.SVarGroup_get(swigCPtr, this, name), false);
  }

  public void set(String name, String content) {
    JirrJNI.SVarGroup_set__SWIG_0(swigCPtr, this, name, content);
  }

  public void set(String name) {
    JirrJNI.SVarGroup_set__SWIG_1(swigCPtr, this, name);
  }

  public void setVariable(SWIGTYPE_p_irr__core__arrayT_irr__scene__quake3__SVariable_irrAllocatorT_irr__scene__quake3__SVariable_t_t value) {
    JirrJNI.SVarGroup_Variable_set(swigCPtr, this, SWIGTYPE_p_irr__core__arrayT_irr__scene__quake3__SVariable_irrAllocatorT_irr__scene__quake3__SVariable_t_t.getCPtr(value));
  }

  public SWIGTYPE_p_irr__core__arrayT_irr__scene__quake3__SVariable_irrAllocatorT_irr__scene__quake3__SVariable_t_t getVariable() {
    long cPtr = JirrJNI.SVarGroup_Variable_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_irr__core__arrayT_irr__scene__quake3__SVariable_irrAllocatorT_irr__scene__quake3__SVariable_t_t(cPtr, false);
  }

}