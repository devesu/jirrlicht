/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public class IGUIElementFactory {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected IGUIElementFactory(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IGUIElementFactory obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JirrJNI.delete_IGUIElementFactory(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IGUIElement addGUIElement(EGUI_ELEMENT_TYPE type, IGUIElement parent) {
    long cPtr = JirrJNI.IGUIElementFactory_addGUIElement__SWIG_0(swigCPtr, this, type.swigValue(), IGUIElement.getCPtr(parent), parent);
    return (cPtr == 0) ? null : new IGUIElement(cPtr, false);
  }

  public IGUIElement addGUIElement(EGUI_ELEMENT_TYPE type) {
    long cPtr = JirrJNI.IGUIElementFactory_addGUIElement__SWIG_1(swigCPtr, this, type.swigValue());
    return (cPtr == 0) ? null : new IGUIElement(cPtr, false);
  }

  public IGUIElement addGUIElement(String typeName, IGUIElement parent) {
    long cPtr = JirrJNI.IGUIElementFactory_addGUIElement__SWIG_2(swigCPtr, this, typeName, IGUIElement.getCPtr(parent), parent);
    return (cPtr == 0) ? null : new IGUIElement(cPtr, false);
  }

  public IGUIElement addGUIElement(String typeName) {
    long cPtr = JirrJNI.IGUIElementFactory_addGUIElement__SWIG_3(swigCPtr, this, typeName);
    return (cPtr == 0) ? null : new IGUIElement(cPtr, false);
  }

  public int getCreatableGUIElementTypeCount() {
    return JirrJNI.IGUIElementFactory_getCreatableGUIElementTypeCount(swigCPtr, this);
  }

  public EGUI_ELEMENT_TYPE getCreateableGUIElementType(int idx) {
    return EGUI_ELEMENT_TYPE.swigToEnum(JirrJNI.IGUIElementFactory_getCreateableGUIElementType(swigCPtr, this, idx));
  }

  public String getCreateableGUIElementTypeName(int idx) {
    return JirrJNI.IGUIElementFactory_getCreateableGUIElementTypeName__SWIG_0(swigCPtr, this, idx);
  }

  public String getCreateableGUIElementTypeName(EGUI_ELEMENT_TYPE type) {
    return JirrJNI.IGUIElementFactory_getCreateableGUIElementTypeName__SWIG_1(swigCPtr, this, type.swigValue());
  }

}
