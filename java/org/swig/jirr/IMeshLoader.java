/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public class IMeshLoader {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected IMeshLoader(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IMeshLoader obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JirrJNI.delete_IMeshLoader(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean isALoadableFileExtension(String filename) {
    return JirrJNI.IMeshLoader_isALoadableFileExtension(swigCPtr, this, CorePath.getCPtr(filename));
  }

  public IAnimatedMesh createMesh(IReadFile file) {
    long cPtr = JirrJNI.IMeshLoader_createMesh(swigCPtr, this, IReadFile.getCPtr(file), file);
    return (cPtr == 0) ? null : new IAnimatedMesh(cPtr, false);
  }

}
