/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public class IGUIFileOpenDialog extends IGUIElement {
  private long swigCPtr;

  protected IGUIFileOpenDialog(long cPtr, boolean cMemoryOwn) {
    super(JirrJNI.IGUIFileOpenDialog_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IGUIFileOpenDialog obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JirrJNI.delete_IGUIFileOpenDialog(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public String getFileName() {
    return JirrJNI.IGUIFileOpenDialog_getFileName(swigCPtr, this);
  }

  public String getDirectoryName() {
    return new CorePath(JirrJNI.IGUIFileOpenDialog_getDirectoryName(swigCPtr, this), false).getText();
  }

}
