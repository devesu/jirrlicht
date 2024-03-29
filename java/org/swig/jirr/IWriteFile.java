/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public class IWriteFile {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected IWriteFile(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IWriteFile obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JirrJNI.delete_IWriteFile(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int write(SWIGTYPE_p_void buffer, long sizeToWrite) {
    return JirrJNI.IWriteFile_write(swigCPtr, this, SWIGTYPE_p_void.getCPtr(buffer), sizeToWrite);
  }

  public boolean seek(int finalPos, boolean relativeMovement) {
    return JirrJNI.IWriteFile_seek__SWIG_0(swigCPtr, this, finalPos, relativeMovement);
  }

  public boolean seek(int finalPos) {
    return JirrJNI.IWriteFile_seek__SWIG_1(swigCPtr, this, finalPos);
  }

  public int getPos() {
    return JirrJNI.IWriteFile_getPos(swigCPtr, this);
  }

  public SWIGTYPE_p_path getFileName() {
    return new SWIGTYPE_p_path(JirrJNI.IWriteFile_getFileName(swigCPtr, this), false);
  }

}
