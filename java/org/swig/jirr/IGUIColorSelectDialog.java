/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public class IGUIColorSelectDialog extends IGUIElement {
  private long swigCPtr;

  protected IGUIColorSelectDialog(long cPtr, boolean cMemoryOwn) {
    super(JirrJNI.IGUIColorSelectDialog_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IGUIColorSelectDialog obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JirrJNI.delete_IGUIColorSelectDialog(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public IGUIColorSelectDialog(IGUIEnvironment environment, IGUIElement parent, int id, recti rectangle) {
    this(JirrJNI.new_IGUIColorSelectDialog(IGUIEnvironment.getCPtr(environment), environment, IGUIElement.getCPtr(parent), parent, id, recti.getCPtr(rectangle), rectangle), true);
  }

}
